// Generated from JSON.g4 by ANTLR 4.13.0
package org.example.jsonantlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JSONParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(JSONParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#operatorOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOrPair(JSONParser.OperatorOrPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(JSONParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#operatorPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorPair(JSONParser.OperatorPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#operatorIncompleteObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorIncompleteObj(JSONParser.OperatorIncompleteObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#pairValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairValue(JSONParser.PairValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(JSONParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#operatorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorValue(JSONParser.OperatorValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JSONParser.ValueContext ctx);
}