// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(CalculatorParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(CalculatorParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#multiplyExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(CalculatorParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#multiplyExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(CalculatorParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(CalculatorParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(CalculatorParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#sqrtExpression}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExpression(CalculatorParser.SqrtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#sqrtExpression}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExpression(CalculatorParser.SqrtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CalculatorParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CalculatorParser.AtomContext ctx);
}