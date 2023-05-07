/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import static connect.ConnectModifier.*;
import data.Rankings;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static models.AccountPlayerModifier.*;
import static quizgame.PlayGame.*;

/**
 *
 * @author THANH
 */
public class ResultPlayerModifier {

    public static void resultPlayer(String jTextFieldCurrentScore) {
        createConnection();
        try {
            String sql = "insert into ResultPlayer values (?, ?, ?)";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, playerID);
            prepStmt.setInt(2, Integer.parseInt(jTextFieldCurrentScore));
            prepStmt.setDouble(3, time);

            prepStmt.execute();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void resultPlayerWrong(String jTextFieldScoreAnswerWrong) {
        createConnection();
        try {
            String sql = "insert into ResultPlayer values (?, ?, ?)";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.setInt(1, playerID);
            prepStmt.setInt(2, Integer.parseInt(jTextFieldScoreAnswerWrong));
            prepStmt.setDouble(3, time);

            prepStmt.execute();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Rankings> viewRank() {
        createConnection();
        try {
            List<Rankings> rankList = new ArrayList<>();
            String sql = "select top 10 r1.Fullname, max(r1.Marks) as Marks, min(r2.[Time]) as [Time] "
                    + "	from Rankings as r1 inner join Rankings as r2 "
                    + "	on r2.AccPlayerID = r1.AccPlayerID and r2.Marks = (select max(Marks) from Rankings as r3 "
                    + "	where r3.AccPlayerID = r1.AccPlayerID) "
                    + "	group by r1.AccPlayerID, r1.Fullname "
                    + " order by Marks desc, [Time]";
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            while (rs.next()) {
                rankList.add(new Rankings(rs.getString("Fullname"), rs.getInt("Marks"), rs.getFloat("Time")));
            }
            return rankList;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static List<Rankings> viewHistoryPlay() {
        createConnection();
        try {
            List<Rankings> rankList = new ArrayList<>();
            String sql = "select Marks, [Time] from Rankings where AccPlayerID = " + playerID;
            PreparedStatement prepStmt = conn.prepareStatement(sql);
            prepStmt.execute();
            ResultSet rs = prepStmt.getResultSet();
            while (rs.next()) {
                rankList.add(new Rankings(rs.getInt("Marks"), rs.getFloat("Time")));
            }
            return rankList;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
