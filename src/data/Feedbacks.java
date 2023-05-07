/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author THANH
 */
public class Feedbacks {

    private int feedID;
    private int accPlayerID;
    private String feedback;

    public Feedbacks() {
    }

    public Feedbacks(int feedID, int accPlayerID, String feedback) {
        this.feedID = feedID;
        this.accPlayerID = accPlayerID;
        this.feedback = feedback;
    }

    public int getFeedID() {
        return feedID;
    }

    public void setFeedID(int feedID) {
        this.feedID = feedID;
    }

    public int getAccPlayerID() {
        return accPlayerID;
    }

    public void setAccPlayerID(int accPlayerID) {
        this.accPlayerID = accPlayerID;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
