/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import model.user.Account;
import model.user.User;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        for(User user:DBUser.getListUsers()){
            System.out.println(user.getAccount().getMail() + user.getPhoneNumber());;
        }
        Account account= new Account();
        account.setIdAccount(3);
        account.setMail("tqt2");
        account.setUsername("tqt1");
        account.setPassword("3");
        account.setRole("user");
        
        User user= new User();
        user.setAccount(account);
        user.setName("truongtq");
        user.setYearBirthday(2003);
        user.setPhoneNumber("0000009");
        user.setIdCard("1010101019");
        DBUser.updateUser(3,user);
    }
}
