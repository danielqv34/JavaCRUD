package com.dqv.conexion;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OraclePreparedStatement;

import java.sql.SQLException;

/**
 * Created by ezequ on 9/25/2016.
 */
public class main {
    public static void main(String[] args) {

        try {
            String store = "SP_INSERTA_PERSONAS(?,?,?,?,?,?,?,?,?)";
            OracleCallableStatement callableStatement = (OracleCallableStatement) OracleConexion.connection().prepareCall(store);
            callableStatement.setInt();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }
}
