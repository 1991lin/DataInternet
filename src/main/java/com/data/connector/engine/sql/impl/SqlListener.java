package com.data.connector.engine.sql.impl;

import com.data.connector.engine.sql.DataInternetBaseListener;
import com.data.connector.engine.sql.DataInternetParser;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Eric
 * @create: 2020-08-22 22:17
 **/

@Slf4j
public class SqlListener extends DataInternetBaseListener {

    @Override
    public void enterSelectClause(DataInternetParser.SelectClauseContext ctx) {
        log.info(ctx.SELECT().getText());
        log.info(ctx.namedExpressionSeq().getText());
        super.enterSelectClause(ctx);
    }

    @Override
    public void enterStatementDefault(DataInternetParser.StatementDefaultContext ctx) {
        super.enterStatementDefault(ctx);
    }

    @Override
    public void enterFromStmt(DataInternetParser.FromStmtContext ctx) {
        super.enterFromStmt(ctx);
    }
}
