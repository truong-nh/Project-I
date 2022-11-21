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
        ac.addUser("name", 0, "phone", "idCard", "mail", "username", "password", "role");
    }
    
}
