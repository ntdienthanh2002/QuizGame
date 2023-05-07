/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import static connect.ConnectModifier.*;
import static quizgame.FeedbackPlayer.*;
import data.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THANH
 */
public class FeedbackAccountPlayerModifier {

    public static List<FeedbackAccountPlayer> viewFeedback() {
        createConnection();
        try {
            List<FeedbackAccountPlayer> feedbackList = new ArrayList<>();
            String sql = "select * from FeedbackAccountPlayer";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            while (rs.next()) {
                feedbackList.add(new FeedbackAccountPlayer(rs.getString("Fullname"), rs.getInt("Phone"), rs.getString("Feedback")));
            }
            return feedbackList;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static List<Feedbacks> findPhoneDeleteFeedback(int phone) {
        createConnection();
        try {
            List<Feedbacks> feedbackList = new ArrayList<>();
            String sql = "select * from Feedback where AccPlayerID = ?";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, getAccountPlayerId(phone));
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            while (rs.next()) {
                feedbackList.add(new Feedbacks(rs.getInt("FeedID"), rs.getInt("AccPlayerID"), rs.getString("Feedback")));
            }
            return feedbackList;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static int getAccountPlayerId(int phone) {
        createConnection();
        try {
            String sql = "select AccPlayerID from AccountPlayer where Phone = ?";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, phone);
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            while (rs.next()) {
                return rs.getInt("AccPlayerID");
            }
            prepStmt.close();
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public static boolean checkPhoneNumberWriteFeedback() {
        createConnection();
        try {
            String sql = "select * from FeedbackAccountPlayer where Phone = ?";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, Integer.parseInt(jTextFieldPhoneNumberWriteFeedback.getText()));
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            if (rs.next()) {
                return false;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

    public static void writeFeedback(int phone, String feedback) {
        createConnection();
        try {
            String sql = "insert into Feedback values (?, ?)";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, getAccountPlayerId(phone));
            prepStmt.setString(2, feedback);
            prepStmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackAccountPlayerModifier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean checkPhoneNumberDeleteFeedback() {
        createConnection();
        try {
            String sql = "select * from FeedbackAccountPlayer where Phone = ?";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, Integer.parseInt(jTextFieldPhoneNumberDeleteFeedback.getText()));
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            if (rs.next()) {
                return false;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

    public static void deleteFeedback(int id) {
        createConnection();
        try {
            String sql = "delete from Feedback where FeedID = ?";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, id);
            prepStmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackAccountPlayerModifier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
