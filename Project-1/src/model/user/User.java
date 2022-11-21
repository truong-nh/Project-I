/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

/**
 *
 * @author Admin
 */
public class User {
    private String name;
    private int yearBirthday;
    private String phoneNumber;
    private String idCard;
    private Account account;
    
    public User(String name, int yearBirthday, String phoneNumber, String idCard, Account account){
        this.name = name;
        this.yearBirthday = yearBirthday;
        this.phoneNumber = phoneNumber;
        this.idCard = idCard;
        this.account = account;
    }
    public User(){
        this.name = null;
        this.yearBirthday = 0;
        this.phoneNumber = null;
        this.idCard = null;
        this.account = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
   
}

