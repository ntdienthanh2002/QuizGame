/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import static connect.ConnectModifier.*;
import quizgame.Start;
import static quizgame.RegisterAccountPlayer.*;
import static quizgame.LoginAccountPlayer.*;
import java.sql.*;

/**
 *
 * @author THANH
 */
public class AccountPlayerModifier {

    public static int playerID;
    public static String fullname;

    public static boolean checkAccountExists() {
        createConnection();
        try {
            String sql = "select * from AccountPlayer where Phone = ?";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, Integer.parseInt(jTextFieldPhoneNumberRegister.getText()));
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            if (rs.next()) {
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static void register() {
        createConnection();
        try {
            String sql = "insert into AccountPlayer values (?, ?, ?, ?, ?, ?)";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, Integer.parseInt(jTextFieldPhoneNumberRegister.getText()));
            prepStmt.setString(2, String.valueOf(jPasswordFieldPasswordRegister.getPassword()));
            prepStmt.setString(3, jTextFieldEmail.getText());
            prepStmt.setString(4, jTextFieldFullname.getText());
            if (jRadioButtonMale.isSelected()) {
                prepStmt.setString(5, "Male");
            } else {
                prepStmt.setString(5, "Female");
            }
            prepStmt.setInt(6, 1);
            prepStmt.execute();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean loginAccPlayer() {
        createConnection();
        try {
            String sql = "select * from AccountPlayer where Phone = ? and Password = ?";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, Integer.parseInt(jTextFieldPhoneNumberLogin.getText()));
            prepStmt.setString(2, String.valueOf(jPasswordFieldPasswordLogin.getPassword()));
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            if (rs.next()) {
                playerID = rs.getInt("AccPlayerID");
                fullname = rs.getString("Fullname");
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static boolean checkStatusPlayer() {
        createConnection();
        try {
            String sql = "select * from AccountPlayer where AccPlayerID = " + playerID;
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            while (rs.next()) {
                if (rs.getInt("Status") == 1) {
                    return true;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
