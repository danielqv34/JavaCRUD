package com.dqv.conexion;

import com.microsoft.sqlserver.jdbc.SQLServerConnection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ezequ on 9/25/2016.
 */
public class SQlServerConexion {

    public static SQLServerConnection getConnection() {
        SQLServerConnection connection = null;
        String url = "jdbc:sqlserver://DANIELQUIROZV\\\\SQLEXPRESS;databaseName=DQUIROZ;integratedSecurity=true";
        String user = "dquirozv";
        String pass = "abc123";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = (SQLServerConnection) DriverManager.getConnection(url);
            System.out.println("Conexion a SQL Server");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
