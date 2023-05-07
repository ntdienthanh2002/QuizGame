/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THANH
 */
public class ConnectModifier {

    public static Connection conn = null;

    public static void createConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName=QuizGame", "sa", "sa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectModifier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectModifier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
