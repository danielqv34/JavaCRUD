package com.dqv.conexion;

import oracle.jdbc.OracleConnection;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ezequ on 9/25/2016.
 */
public class OracleConexion {

    public static OracleConnection connection() {
        String url = "jdbc:oracle:thin:@//localhost:1521/springcrud";
        String user = "c##dquiroz";
        String pass = "abc123";
        OracleConnection connection = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = (OracleConnection) DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conexion con Oracle exitosa");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
