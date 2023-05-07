/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht;

/**
 *
 * @author PC
 */
public class FA {

    private int FeedID;
    private int AccPlayerID;
    private String Feedback;

    public FA(int FeedID, int AccPlayerID, String Feedback) {
        this.FeedID = FeedID;
        this.AccPlayerID = AccPlayerID;
        this.Feedback = Feedback;
    }

    public int getFeedID() {
        return FeedID;
    }

    public void setFeedID(int FeedID) {
        this.FeedID = FeedID;
    }

    public int getAccPlayerID() {
        return AccPlayerID;
    }

    public void setAccPlayerID(int AccPlayerID) {
        this.AccPlayerID = AccPlayerID;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }

}
