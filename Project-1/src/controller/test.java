/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.user.User;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        User user= new User();
        AccountController ac= new AccountController(user);
        ac.getListUser();
        // System.out.println(ac.getUserByUserName("truong").getPhoneNumber());
        System.out.println(ac.getCurrentIdAccount()); 
        System.out.println(ac.addUser("name", 0, "0111111111", "111111111", "mail@s", "username", "password", "role"));
        System.out.println(ac.checkErrorCreateAccount("name", 0, "0111111111", "111111111", "mail@s", "username", "password", "role").isEmpty());
    }
    
}
