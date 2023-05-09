import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

import java.lang.*;

public class CalculatorMainListener extends CalculatorBaseListener {

    private Deque<Double> numbers = new ArrayDeque<>();

    @Override
    public void exitExpression(CalculatorParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return;
        }

        System.out.println("exitExpression:" + ctx.getText());
        double result = numbers.removeFirst();
        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            String operator = ctx.getChild(i).getText();
            double argument = numbers.removeFirst();
            switch (operator) {
                case "+":
                    result = result + argument;
                    break;
                case "-":
                    result = result - argument;
                    break;
                default:
                    throw new IllegalArgumentException("Niewlasciwy argument: " + operator);
            }
        }

        numbers.addLast(result);
        super.exitExpression(ctx);
    }



    @Override
    public void exitMultiplyExpression(CalculatorParser.MultiplyExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return;
        }
        System.out.println("exitMultiplyExpression:" + ctx.getText());

        double result = numbers.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i += 2) {
            String operator = ctx.getChild(i).getText();
            double argument = numbers.removeLast();
            switch (operator) {
                case "*":
                    result = argument * result;
                    break;
                case "/":
                    if (result == 0) {
                        throw new ArithmeticException("Nie wolno dzielic przez 0");
                    }
                    result = argument / result;
                    break;
                default:
                    throw new IllegalArgumentException("Niewlasciwy argument: " + operator);
            }
        }

        numbers.addLast(result);
        super.exitMultiplyExpression(ctx);
    }



    @Override
    public void exitPowerExpression(CalculatorParser.PowerExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return;
        }
        System.out.println("exitPowerExpression:" + ctx.getText());
        double right = numbers.removeLast();
        double left = numbers.removeLast();

        numbers.addLast(Math.pow(left, right));
        super.exitPowerExpression(ctx);
    }

    @Override
    public void exitSqrtExpression(CalculatorParser.SqrtExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return;
        }
        System.out.println("exitSqrtExpression:" + ctx.getText());
        double value = numbers.removeLast();

        if (ctx.SQRT() != null) {
            numbers.addLast(Math.sqrt(value));
        }
        super.exitSqrtExpression(ctx);
    }



    @Override
    public void visitTerminal(TerminalNode node) {
        //System.out.println("exitTerminal node:" + node.getText());
        if (node.getSymbol().getType() == CalculatorParser.NUMBER) {
            numbers.addLast(Double.parseDouble(node.getText()));
        } else if (node.getSymbol().getType() == CalculatorParser.MINUS && node.getParent() instanceof CalculatorParser.AtomContext) {
            return;
        }
        //super.visitTerminal(node);
    }
    @Override
    public void exitAtom(CalculatorParser.AtomContext ctx) {
        if (ctx.getChildCount() == 1) {
            return;
        }
        System.out.println("exitAtom:" + ctx.getText());
        if (ctx.MINUS() != null) {
            numbers.addLast(-numbers.removeLast());
        }
        super.exitAtom(ctx);
    }

    public double getResult() {
        
        return numbers.removeLast();
    }


    public static void main(String[] args) throws Exception {
        Double result = calc("20 + 5 * 2.2 - 10 / 2.5 + 5.05");
        Double result1 = calc("(2 ^ 3) ^ (1 / 3)");
        Double result2 = calc("- 1 - 25 / 5");
        Double result3 = calc("sqrt(10*10+21)+sqrt(4)*sqrt100");
        Double result4 = calc("(2 ^ 2 + 2 - sqrt4 )/ 2");
        System.out.println("Result = " + result);
        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);
        System.out.println("Result3 = " + result3);
        System.out.println("Result4 = " + result4);
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

}

