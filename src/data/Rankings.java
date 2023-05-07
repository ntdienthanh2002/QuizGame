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
public class Rankings {
    private String fullname;
    private int marks;
    private float time;

    public Rankings() {
    }

    public Rankings(String fullname, int marks, float time) {
        this.fullname = fullname;
        this.marks = marks;
        this.time = time;
    }

    public Rankings(int marks, float time) {
        this.marks = marks;
        this.time = time;
    }
    
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
}
