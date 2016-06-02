
package com.db.fatcow.test;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://revelentobjectcom.fatcowmysql.com:3306/springtutorial";
        String driver = "org.gjt.mm.mysql.Driver";
        String username = "rossllcdb";
        String password = "Mkwi181olaahshd__19";
        String sql;
        Statement statement;
        ResultSet result;

        System.out.println("Connecting database...");

        try (Connection connection = (Connection) DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");

         /*   sql = "select distinct id, created_date, user_id,invoice_number,received_date from receiving_document";
            
            statement = connection.createStatement();

            Class.forName( driver );
            System.out.println("Driver loaded!");

            result = statement.executeQuery(sql);
            while (result.next()) {
                System.out.println("SOMS data from MySQL : "
                        + result.getString("id") + ","
                        + result.getString("created_date") + ","
                        + result.getString("user_id") + ","
                        + result.getString("invoice_number") + ","
                        + result.getString("received_date")
                ); 
            } */

            System.out.println("done");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
     /*   }  catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
     */   }
    }

}
