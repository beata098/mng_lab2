import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

import java.lang.*;

public class CalculatorMainListener extends CalculatorBaseListener {

    Deque<Double> numbers = new ArrayDeque<>();

    @Override
    public void enterExpression(CalculatorParser.ExpressionContext ctx) {
        System.out.println("enterExpression:" + ctx.getText());
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(CalculatorParser.ExpressionContext ctx) {
        Double value = numbers.pop();
        int i = 1;
        while (i < ctx.getChildCount()) {
            String operator = ctx.getChild(i).getText();
            if (operator.equals("+") || operator.equals("-")) {
                i += 2;
                continue;
            }

            Double operand = Double.parseDouble(ctx.getChild(i + 1).getText());
            switch (operator) {
                case "*":
                    value *= operand;
                    break;
                case "/":
                    value /= operand;
                    break;
                case "^":
                    value = Math.pow(value, operand);
                    break;
                case "sqrt":
                    value = Math.sqrt(value);
                    break;
                default:
                    throw new IllegalArgumentException("Niewlasciwy argument");
            }
            i += 2;
        }

        numbers.add(value);
        super.exitExpression(ctx);
    }


    @Override
    public void exitMultiplyExpression(CalculatorParser.MultiplyExpressionContext ctx) {
        System.out.println("exitMultiplyExpression: " + ctx.getText());
        List<CalculatorParser.PowerExpressionContext> powerExpressions = ctx.powerExpression();
        double result = Double.parseDouble(powerExpressions.get(0).getText());
        for (int i = 1; i < powerExpressions.size(); i++) {
            String operator = ctx.getChild(2*i - 1).getText();
            double number = Double.parseDouble(powerExpressions.get(i).getText());
            switch (operator) {
                case "*":
                    result *= number;
                    break;
                case "/":
                    if (number == 0.0) {
                        throw new IllegalArgumentException("Division by zero");
                    }
                    result /= number;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
        numbers.add(result);
        super.exitMultiplyExpression(ctx);
    }

    @Override
    public void exitAddExpression(CalculatorParser.AddExpressionContext ctx) {
        System.out.println("exitAddExpression:" + ctx.getText());
        double result = 0;
        int sign = 1;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof CalculatorParser.MultiplyExpressionContext) {
                double value = numbers.pop();
                result += sign * value;
            } else if (child.getText().equals("+")) {
                sign = 1;
            } else if (child.getText().equals("-")) {
                sign = -1;
            }/*else {
                continue;
            }*/
        }
        numbers.add(result);
        super.exitAddExpression(ctx);
    }

    @Override
    public void exitPowerExpression(CalculatorParser.PowerExpressionContext ctx) {
        if (ctx.POWER() != null) {
            double exponent = numbers.pop();
            double base = numbers.pop();
            double result = Math.pow(base, exponent);
            numbers.add(result);
        }
        super.exitPowerExpression(ctx);
    }


    public static void main(String[] args) throws Exception {
        //CharStream charStreams = CharStreams.fromFileName("./example.txt");
        Double result = calc(" 99 / 3 / 3 * 9 + 1 ");
        Double result1 = calc("1 - 25 * 4 ");
        System.out.println("Result = " + result);
        System.out.println("Result = " + result1);

    }

    public static Double calc(String expression) {
        return calc(CharStreams.fromString(expression));
    }

    public static Double calc(CharStream charStream) {
        CalculatorLexer lexer = new CalculatorLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();

        ParseTreeWalker walker = new ParseTreeWalker();
        CalculatorMainListener mainListener = new CalculatorMainListener();
        walker.walk(mainListener, tree);
        return mainListener.getResult();
    }

    private Double getResult() {
        return numbers.peek();
    }

}
