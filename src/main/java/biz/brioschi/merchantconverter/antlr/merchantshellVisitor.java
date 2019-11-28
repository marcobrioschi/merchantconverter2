// Generated from C:/MyData/_WorkingDir/Repositories/git/merchantconverter2/antlr\merchantshell.g4 by ANTLR 4.7.2
package biz.brioschi.merchantconverter.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link merchantshellParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface merchantshellVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link merchantshellParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(merchantshellParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link merchantshellParser#commandline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandline(merchantshellParser.CommandlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link merchantshellParser#symboldeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymboldeclaration(merchantshellParser.SymboldeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link merchantshellParser#symbolconversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolconversion(merchantshellParser.SymbolconversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link merchantshellParser#goodspricing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodspricing(merchantshellParser.GoodspricingContext ctx);
	/**
	 * Visit a parse tree produced by {@link merchantshellParser#goodstrading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodstrading(merchantshellParser.GoodstradingContext ctx);
}