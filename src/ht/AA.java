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
public class AA {

    private int AccAdminID;
    private String Username;
    private String Password;
    private String Fullname;
    private String Email;

    public AA(int AccAdminID, String Username, String Password, String Fullname, String Email) {
        this.AccAdminID = AccAdminID;
        this.Username = Username;
        this.Password = Password;
        this.Fullname = Fullname;
        this.Email = Email;
    }

    public int getAccAdminID() {
        return AccAdminID;
    }

    public void setAccAdminID(int AccAdminID) {
        this.AccAdminID = AccAdminID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
