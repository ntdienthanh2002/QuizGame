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
public class FeedbackAccountPlayer {

    private String fullname;
    private int phone;
    private String feedback;

    public FeedbackAccountPlayer() {
    }

    public FeedbackAccountPlayer(String fullname, int phone, String feedback) {
        this.fullname = fullname;
        this.phone = phone;
        this.feedback = feedback;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
