/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBUser;
import java.util.List;
import model.user.Account;
import model.user.User;

/**
 *
 * @author Admin
 */
public class AccountController {
     private User user;

    public AccountController(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
   public void addUser(User user){
       DBUser.addUser(user);
   }
   
   public void addUser(String name, int yearBirthday, String phoneNumber, String idCard, Account account){
       DBUser.addUser(new User(name, yearBirthday, phoneNumber, idCard, account));
   }
   
   public List<User> getListUser(){
       return DBUser.getListUsers();
   }
   
   public void addAccount(String mail, String username, String password, int idAccount, String role){
       DBUser.addAccount(new Account(mail, username, password, idAccount, role));
   }
   
   public void addAccount(Account account){
       DBUser.addAccount(account);
   }
   
   public void updateUser(int iduser,User user){
      DBUser.updateUser(iduser, user);
   }
 
   public User getUserByUserName(String userName){
       for(User user : this.getListUser()){
           if(user.getAccount().getUsername().equals(userName)){
           return user;
           }
       }
       return null;
   }
}
