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
public class AP {

    private int AccPlayerID;
    private int Phone;
    private String Email;
    private String Fullname;
    private String Gender;
    private int Status;

    public AP(int AccPlayerID, int Phone, String Email, String Fullname, String Gender, int Status) {
        this.AccPlayerID = AccPlayerID;
        this.Phone = Phone;
        this.Email = Email;
        this.Fullname = Fullname;
        this.Gender = Gender;
        this.Status = Status;
    }

    public int getAccPlayerID() {
        return AccPlayerID;
    }

    public void setAccPlayerID(int AccPlayerID) {
        this.AccPlayerID = AccPlayerID;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

}
