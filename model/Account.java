package model;

public class Account {
    private String Mail;
    private String Username;
    private String Password;
    private int IDaccount;
    private String Role;

    public Account(){
        
    }
    public String getMail() {
        return Mail;
    }
    public String getUsername() {
        return Username;
    }
    public String getPassword() {
        return Password;
    }
    public int getIDaccount() {
        return IDaccount;
    }
    public String getRole() {
        return Role;
    }
    public void setMail(String mail) {
        Mail = mail;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public void setIDaccount(int iDaccount) {
        IDaccount = iDaccount;
    }
    public void setRole(String role) {
        Role = role;
    }
}
