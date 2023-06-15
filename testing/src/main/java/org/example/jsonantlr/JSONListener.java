// Generated from JSON.g4 by ANTLR 4.13.0
package org.example.jsonantlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(JSONParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(JSONParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#operatorOrPair}.
	 * @param ctx the parse tree
	 */
	void enterOperatorOrPair(JSONParser.OperatorOrPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#operatorOrPair}.
	 * @param ctx the parse tree
	 */
	void exitOperatorOrPair(JSONParser.OperatorOrPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSONParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#operatorPair}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPair(JSONParser.OperatorPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#operatorPair}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPair(JSONParser.OperatorPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#operatorIncompleteObj}.
	 * @param ctx the parse tree
	 */
	void enterOperatorIncompleteObj(JSONParser.OperatorIncompleteObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#operatorIncompleteObj}.
	 * @param ctx the parse tree
	 */
	void exitOperatorIncompleteObj(JSONParser.OperatorIncompleteObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#pairValue}.
	 * @param ctx the parse tree
	 */
	void enterPairValue(JSONParser.PairValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#pairValue}.
	 * @param ctx the parse tree
	 */
	void exitPairValue(JSONParser.PairValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(JSONParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(JSONParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#operatorValue}.
	 * @param ctx the parse tree
	 */
	void enterOperatorValue(JSONParser.OperatorValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#operatorValue}.
	 * @param ctx the parse tree
	 */
	void exitOperatorValue(JSONParser.OperatorValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JSONParser.ValueContext ctx);
}