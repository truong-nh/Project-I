/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBUser;
import java.util.List;
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
   
   public List<User> getListUser(){
       return DBUser.getListUsers();
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
