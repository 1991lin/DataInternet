package com.data.connector.engine.sql;

import com.data.connector.engine.sql.impl.SqlListener;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author: Eric
 * @create: 2020-08-22 22:12
 **/


@Slf4j
public class SqlStarter {

    public static void main(String[] arg){

        ANTLRInputStream antlrInputStream = new ANTLRInputStream("select * from A;");
        DataInternetLexer lexer = new DataInternetLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        DataInternetParser dataInternetParser = new DataInternetParser(commonTokenStream);

        SqlListener sqlListener = new SqlListener();
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        dataInternetParser.addParseListener(sqlListener);



        ParseTree tree = dataInternetParser.statement();
//        parseTreeWalker.walk(sqlListener, tree);
//        log.info(tree.toStringTree(dataInternetParser));

    }

}
