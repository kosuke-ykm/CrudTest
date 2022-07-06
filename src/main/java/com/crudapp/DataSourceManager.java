package com.crudapp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceManager {

    /**
     *  データベースに接続するコネクションを取得します
     *  @return コネクション
     */
    public static Connection getConnection() throws ServletException, NamingException, SQLException {
        try {
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup("jdbc:postgresql://127.0.0.1:5432/postgres");
            return dataSource.getConnection();
        } catch (NamingException e) {
            throw e;
        } catch (SQLException e) {
            throw e;
        }
    }
}
