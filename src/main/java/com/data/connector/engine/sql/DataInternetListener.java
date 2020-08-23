// Generated from /Users/eric/IdeaProjects/DataInternet/src/main/resources/DataInternet.g4 by ANTLR 4.8
package com.data.connector.engine.sql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataInternetParser}.
 */
public interface DataInternetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(DataInternetParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(DataInternetParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(DataInternetParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(DataInternetParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(DataInternetParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(DataInternetParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleMultipartIdentifier(DataInternetParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleMultipartIdentifier(DataInternetParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(DataInternetParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(DataInternetParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(DataInternetParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(DataInternetParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableSchema(DataInternetParser.SingleTableSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableSchema(DataInternetParser.SingleTableSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(DataInternetParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(DataInternetParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(DataInternetParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(DataInternetParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(DataInternetParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(DataInternetParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateNamespace(DataInternetParser.CreateNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateNamespace(DataInternetParser.CreateNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceProperties(DataInternetParser.SetNamespacePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceProperties(DataInternetParser.SetNamespacePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceLocation(DataInternetParser.SetNamespaceLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceLocation(DataInternetParser.SetNamespaceLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropNamespace(DataInternetParser.DropNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropNamespace(DataInternetParser.DropNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowNamespaces(DataInternetParser.ShowNamespacesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowNamespaces(DataInternetParser.ShowNamespacesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(DataInternetParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(DataInternetParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateHiveTable(DataInternetParser.CreateHiveTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateHiveTable(DataInternetParser.CreateHiveTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(DataInternetParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(DataInternetParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTable(DataInternetParser.ReplaceTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTable(DataInternetParser.ReplaceTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(DataInternetParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(DataInternetParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(DataInternetParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(DataInternetParser.AddTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableColumn(DataInternetParser.RenameTableColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableColumn(DataInternetParser.RenameTableColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableColumns(DataInternetParser.DropTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableColumns(DataInternetParser.DropTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(DataInternetParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(DataInternetParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(DataInternetParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(DataInternetParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(DataInternetParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(DataInternetParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAlterColumn(DataInternetParser.AlterTableAlterColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAlterColumn(DataInternetParser.AlterTableAlterColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveChangeColumn(DataInternetParser.HiveChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveChangeColumn(DataInternetParser.HiveChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveReplaceColumns(DataInternetParser.HiveReplaceColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveReplaceColumns}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveReplaceColumns(DataInternetParser.HiveReplaceColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(DataInternetParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(DataInternetParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(DataInternetParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(DataInternetParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(DataInternetParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(DataInternetParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(DataInternetParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(DataInternetParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(DataInternetParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(DataInternetParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(DataInternetParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(DataInternetParser.RecoverPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(DataInternetParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(DataInternetParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropView(DataInternetParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropView(DataInternetParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(DataInternetParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(DataInternetParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(DataInternetParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(DataInternetParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(DataInternetParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(DataInternetParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(DataInternetParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(DataInternetParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(DataInternetParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(DataInternetParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(DataInternetParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(DataInternetParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(DataInternetParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(DataInternetParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(DataInternetParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(DataInternetParser.ShowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(DataInternetParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(DataInternetParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(DataInternetParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(DataInternetParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowViews(DataInternetParser.ShowViewsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowViews(DataInternetParser.ShowViewsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(DataInternetParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(DataInternetParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(DataInternetParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(DataInternetParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(DataInternetParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(DataInternetParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCurrentNamespace(DataInternetParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCurrentNamespace(DataInternetParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(DataInternetParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(DataInternetParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeNamespace(DataInternetParser.DescribeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeNamespace(DataInternetParser.DescribeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeRelation(DataInternetParser.DescribeRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeRelation(DataInternetParser.DescribeRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(DataInternetParser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(DataInternetParser.DescribeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentNamespace(DataInternetParser.CommentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentNamespace(DataInternetParser.CommentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentTable(DataInternetParser.CommentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentTable(DataInternetParser.CommentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(DataInternetParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(DataInternetParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshFunction(DataInternetParser.RefreshFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshFunction}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshFunction(DataInternetParser.RefreshFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(DataInternetParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(DataInternetParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(DataInternetParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(DataInternetParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(DataInternetParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(DataInternetParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(DataInternetParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(DataInternetParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(DataInternetParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(DataInternetParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(DataInternetParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(DataInternetParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(DataInternetParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(DataInternetParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(DataInternetParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(DataInternetParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(DataInternetParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(DataInternetParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTimeZone(DataInternetParser.SetTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTimeZone}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTimeZone(DataInternetParser.SetTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetQuotedConfiguration(DataInternetParser.SetQuotedConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setQuotedConfiguration}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetQuotedConfiguration(DataInternetParser.SetQuotedConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(DataInternetParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(DataInternetParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetQuotedConfiguration(DataInternetParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetQuotedConfiguration}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetQuotedConfiguration(DataInternetParser.ResetQuotedConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(DataInternetParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link DataInternetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(DataInternetParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#configKey}.
	 * @param ctx the parse tree
	 */
	void enterConfigKey(DataInternetParser.ConfigKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#configKey}.
	 * @param ctx the parse tree
	 */
	void exitConfigKey(DataInternetParser.ConfigKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(DataInternetParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(DataInternetParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(DataInternetParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(DataInternetParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTableHeader(DataInternetParser.ReplaceTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTableHeader(DataInternetParser.ReplaceTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(DataInternetParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(DataInternetParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(DataInternetParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(DataInternetParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(DataInternetParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(DataInternetParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(DataInternetParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(DataInternetParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DataInternetParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DataInternetParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link DataInternetParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(DataInternetParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link DataInternetParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(DataInternetParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link DataInternetParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(DataInternetParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link DataInternetParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(DataInternetParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link DataInternetParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(DataInternetParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link DataInternetParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(DataInternetParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link DataInternetParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(DataInternetParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link DataInternetParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(DataInternetParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(DataInternetParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(DataInternetParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(DataInternetParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(DataInternetParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(DataInternetParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(DataInternetParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(DataInternetParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(DataInternetParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(DataInternetParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(DataInternetParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(DataInternetParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(DataInternetParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(DataInternetParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(DataInternetParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(DataInternetParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(DataInternetParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(DataInternetParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(DataInternetParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableClauses(DataInternetParser.CreateTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableClauses(DataInternetParser.CreateTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(DataInternetParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(DataInternetParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(DataInternetParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(DataInternetParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(DataInternetParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(DataInternetParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(DataInternetParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(DataInternetParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(DataInternetParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(DataInternetParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(DataInternetParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(DataInternetParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(DataInternetParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(DataInternetParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link DataInternetParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(DataInternetParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link DataInternetParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(DataInternetParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link DataInternetParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(DataInternetParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link DataInternetParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(DataInternetParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(DataInternetParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(DataInternetParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(DataInternetParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(DataInternetParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(DataInternetParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(DataInternetParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(DataInternetParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(DataInternetParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromTable(DataInternetParser.DeleteFromTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromTable(DataInternetParser.DeleteFromTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTable(DataInternetParser.UpdateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTable(DataInternetParser.UpdateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMergeIntoTable(DataInternetParser.MergeIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link DataInternetParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMergeIntoTable(DataInternetParser.MergeIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(DataInternetParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(DataInternetParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(DataInternetParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(DataInternetParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link DataInternetParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(DataInternetParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link DataInternetParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(DataInternetParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DataInternetParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(DataInternetParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link DataInternetParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(DataInternetParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(DataInternetParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(DataInternetParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(DataInternetParser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(DataInternetParser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(DataInternetParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(DataInternetParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(DataInternetParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(DataInternetParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(DataInternetParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link DataInternetParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(DataInternetParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(DataInternetParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(DataInternetParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromStatement(DataInternetParser.FromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromStatement(DataInternetParser.FromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterFromStatementBody(DataInternetParser.FromStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitFromStatementBody(DataInternetParser.FromStatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link DataInternetParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterTransformQuerySpecification(DataInternetParser.TransformQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link DataInternetParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitTransformQuerySpecification(DataInternetParser.TransformQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link DataInternetParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterRegularQuerySpecification(DataInternetParser.RegularQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link DataInternetParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitRegularQuerySpecification(DataInternetParser.RegularQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void enterTransformClause(DataInternetParser.TransformClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void exitTransformClause(DataInternetParser.TransformClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(DataInternetParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(DataInternetParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(DataInternetParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(DataInternetParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchedClause(DataInternetParser.MatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchedClause(DataInternetParser.MatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedClause(DataInternetParser.NotMatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedClause(DataInternetParser.NotMatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void enterMatchedAction(DataInternetParser.MatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void exitMatchedAction(DataInternetParser.MatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedAction(DataInternetParser.NotMatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedAction(DataInternetParser.NotMatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(DataInternetParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(DataInternetParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DataInternetParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DataInternetParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(DataInternetParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(DataInternetParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(DataInternetParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(DataInternetParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(DataInternetParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(DataInternetParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(DataInternetParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(DataInternetParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(DataInternetParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(DataInternetParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregationClause(DataInternetParser.AggregationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregationClause(DataInternetParser.AggregationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(DataInternetParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(DataInternetParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(DataInternetParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(DataInternetParser.PivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterPivotColumn(DataInternetParser.PivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitPivotColumn(DataInternetParser.PivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void enterPivotValue(DataInternetParser.PivotValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void exitPivotValue(DataInternetParser.PivotValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(DataInternetParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(DataInternetParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(DataInternetParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(DataInternetParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(DataInternetParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(DataInternetParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(DataInternetParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(DataInternetParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(DataInternetParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(DataInternetParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(DataInternetParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(DataInternetParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(DataInternetParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(DataInternetParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link DataInternetParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(DataInternetParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link DataInternetParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(DataInternetParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link DataInternetParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(DataInternetParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link DataInternetParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(DataInternetParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link DataInternetParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(DataInternetParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link DataInternetParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(DataInternetParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link DataInternetParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(DataInternetParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link DataInternetParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(DataInternetParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(DataInternetParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(DataInternetParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(DataInternetParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(DataInternetParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(DataInternetParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(DataInternetParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(DataInternetParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(DataInternetParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(DataInternetParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(DataInternetParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(DataInternetParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(DataInternetParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DataInternetParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DataInternetParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(DataInternetParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(DataInternetParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(DataInternetParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(DataInternetParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(DataInternetParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(DataInternetParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(DataInternetParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link DataInternetParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(DataInternetParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(DataInternetParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(DataInternetParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(DataInternetParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(DataInternetParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(DataInternetParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(DataInternetParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link DataInternetParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(DataInternetParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link DataInternetParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(DataInternetParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link DataInternetParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(DataInternetParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link DataInternetParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(DataInternetParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierList(DataInternetParser.MultipartIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierList(DataInternetParser.MultipartIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(DataInternetParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(DataInternetParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(DataInternetParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(DataInternetParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(DataInternetParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(DataInternetParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(DataInternetParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(DataInternetParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(DataInternetParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(DataInternetParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#transformList}.
	 * @param ctx the parse tree
	 */
	void enterTransformList(DataInternetParser.TransformListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#transformList}.
	 * @param ctx the parse tree
	 */
	void exitTransformList(DataInternetParser.TransformListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link DataInternetParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterIdentityTransform(DataInternetParser.IdentityTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link DataInternetParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitIdentityTransform(DataInternetParser.IdentityTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link DataInternetParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransform(DataInternetParser.ApplyTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link DataInternetParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransform(DataInternetParser.ApplyTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void enterTransformArgument(DataInternetParser.TransformArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void exitTransformArgument(DataInternetParser.TransformArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DataInternetParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DataInternetParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link DataInternetParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(DataInternetParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link DataInternetParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(DataInternetParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link DataInternetParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(DataInternetParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link DataInternetParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(DataInternetParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link DataInternetParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(DataInternetParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link DataInternetParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(DataInternetParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link DataInternetParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(DataInternetParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link DataInternetParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(DataInternetParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(DataInternetParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(DataInternetParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link DataInternetParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(DataInternetParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link DataInternetParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(DataInternetParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link DataInternetParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DataInternetParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link DataInternetParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DataInternetParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link DataInternetParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(DataInternetParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link DataInternetParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(DataInternetParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link DataInternetParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(DataInternetParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link DataInternetParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(DataInternetParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(DataInternetParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(DataInternetParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(DataInternetParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(DataInternetParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(DataInternetParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(DataInternetParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(DataInternetParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(DataInternetParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(DataInternetParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(DataInternetParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(DataInternetParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(DataInternetParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(DataInternetParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(DataInternetParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOverlay(DataInternetParser.OverlayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOverlay(DataInternetParser.OverlayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(DataInternetParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(DataInternetParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(DataInternetParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(DataInternetParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(DataInternetParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(DataInternetParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDatetime(DataInternetParser.CurrentDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDatetime(DataInternetParser.CurrentDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(DataInternetParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(DataInternetParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(DataInternetParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(DataInternetParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(DataInternetParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(DataInternetParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(DataInternetParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(DataInternetParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(DataInternetParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(DataInternetParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrim(DataInternetParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrim(DataInternetParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DataInternetParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DataInternetParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(DataInternetParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(DataInternetParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(DataInternetParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(DataInternetParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(DataInternetParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link DataInternetParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(DataInternetParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(DataInternetParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(DataInternetParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(DataInternetParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(DataInternetParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(DataInternetParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(DataInternetParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(DataInternetParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(DataInternetParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(DataInternetParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(DataInternetParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(DataInternetParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DataInternetParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(DataInternetParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(DataInternetParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(DataInternetParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(DataInternetParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(DataInternetParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(DataInternetParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(DataInternetParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(DataInternetParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(DataInternetParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(DataInternetParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(DataInternetParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingMultiUnitsInterval(DataInternetParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingMultiUnitsInterval(DataInternetParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterMultiUnitsInterval(DataInternetParser.MultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitMultiUnitsInterval(DataInternetParser.MultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingUnitToUnitInterval(DataInternetParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingUnitToUnitInterval(DataInternetParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterUnitToUnitInterval(DataInternetParser.UnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitUnitToUnitInterval(DataInternetParser.UnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(DataInternetParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(DataInternetParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(DataInternetParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(DataInternetParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(DataInternetParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(DataInternetParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link DataInternetParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(DataInternetParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link DataInternetParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(DataInternetParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DataInternetParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(DataInternetParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DataInternetParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(DataInternetParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPositionList(DataInternetParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPositionList(DataInternetParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPosition(DataInternetParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPosition(DataInternetParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(DataInternetParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(DataInternetParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(DataInternetParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(DataInternetParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(DataInternetParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(DataInternetParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(DataInternetParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(DataInternetParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(DataInternetParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(DataInternetParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(DataInternetParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(DataInternetParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(DataInternetParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(DataInternetParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link DataInternetParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(DataInternetParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link DataInternetParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(DataInternetParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link DataInternetParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(DataInternetParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link DataInternetParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(DataInternetParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(DataInternetParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(DataInternetParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(DataInternetParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(DataInternetParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(DataInternetParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(DataInternetParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(DataInternetParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(DataInternetParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DataInternetParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DataInternetParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(DataInternetParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(DataInternetParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link DataInternetParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(DataInternetParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link DataInternetParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(DataInternetParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link DataInternetParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(DataInternetParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link DataInternetParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(DataInternetParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DataInternetParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DataInternetParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DataInternetParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(DataInternetParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DataInternetParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(DataInternetParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DataInternetParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(DataInternetParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DataInternetParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(DataInternetParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(DataInternetParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(DataInternetParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponentLiteral(DataInternetParser.ExponentLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponentLiteral(DataInternetParser.ExponentLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(DataInternetParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(DataInternetParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterLegacyDecimalLiteral(DataInternetParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitLegacyDecimalLiteral(DataInternetParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(DataInternetParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(DataInternetParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(DataInternetParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(DataInternetParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(DataInternetParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(DataInternetParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(DataInternetParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(DataInternetParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(DataInternetParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(DataInternetParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(DataInternetParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(DataInternetParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(DataInternetParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DataInternetParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(DataInternetParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAction(DataInternetParser.AlterColumnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAction(DataInternetParser.AlterColumnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterAnsiNonReserved(DataInternetParser.AnsiNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitAnsiNonReserved(DataInternetParser.AnsiNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterStrictNonReserved(DataInternetParser.StrictNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitStrictNonReserved(DataInternetParser.StrictNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataInternetParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(DataInternetParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataInternetParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(DataInternetParser.NonReservedContext ctx);
}