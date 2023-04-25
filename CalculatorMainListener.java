import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CalculatorMainListener extends CalculatorBaseListener{

    public static void main(String[] args) throws Exception {
        CharStream charStreams = CharStreams.fromFileName("./example.txt");
        Integer result = calc(charStreams);
        System.out.println("Result = " + result);
    }

    public static Integer calc(String expression) {
        return calc(CharStreams.fromString(expression));
    }

    public static Integer calc(CharStream charStream) {
        CalculatorLexer lexer = new CalculatorLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();

        ParseTreeWalker walker = new ParseTreeWalker();
        CalculatorMainListener mainListener = new CalculatorMainListener();
        walker.walk(mainListener, tree);
        return mainListener.getResult();
    }

    private Integer getResult() {
        return 0;
    }
}
