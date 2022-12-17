/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBUser;
import java.util.ArrayList;
import java.util.List;
import model.user.Account;
import model.user.User;

/**
 *
 * @author Admin
 */
public class AccountController {
     private User user;

    public AccountController() {
        
    }
     
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
   
   public int getCurrentIdAccount(){
       int maxIdCurrent=0;
       for(User user:this.getListUser()){
          if( user.getAccount().getIdAccount()>=maxIdCurrent ){
             maxIdCurrent= user.getAccount().getIdAccount();
          }
       }
       return  maxIdCurrent;
   }
   
   public void addUser(String name, int yearBirthday, String phoneNumber, String idCard, Account account){
       DBUser.addUser(new User(name, yearBirthday, phoneNumber, idCard, account));
   }
     
   // add user tat ca thuoc tinh; thuoc tinh id tu dong tang
   //ham can chinh sua
    public boolean addUser(String name, int yearBirthday, String phoneNumber, String idCard,
        String mail, String username, String password, String role){
        Account account= new Account(mail, username, password, this.getCurrentIdAccount()+1, role);

        try {
            DBUser.addUser(new User(name, yearBirthday, phoneNumber, idCard, account));
            return true;
        } catch (Exception e) {
            return false;
        }
        
   }
        
    /// check error
    public List<String> checkErrorCreateAccount(String name, int yearBirthday, String phoneNumber, String idCard,
        String mail, String username, String password, String role){
        Account account= new Account(mail, username, password, this.getCurrentIdAccount()+1, role);
        
                List<String> listStringError = new ArrayList<>();

        // check number        
        if (phoneNumber.length() != 10 || !phoneNumber.substring(0,1).equals("0")){
            listStringError.add("-Số điện thoại bao gồm 10 số \n");
        }
        
        // check idcard
        if (idCard.length() != 9){
            if (idCard.length() != 12){
                listStringError.add("-CCCD/CMT không hợp lệ \n");
            }
        }
        
        // check mail
        int z = 0;
        for (int i = 0; i<mail.length(); i++){
            if (mail.substring(i,i+1).equals("@")){
                z = 1;
            }
        }
        if (z == 0)  listStringError.add("-Định dạng mail không hợp lệ \n");
        
        // check legit account
        List<User> ListCheck = new ArrayList<User>();
        ListCheck = getListUser();
        for (User ListElement : ListCheck) {
            Account accountcheck = new Account();
            accountcheck = ListElement.getAccount();
            if (accountcheck.getUsername().equals(username)){
                listStringError.add(" Tài khoản đã tồn tại \n");
            }
        }

        return listStringError;
        
   }
   
    
   public List<User> getListUser(){
       return DBUser.getListUsers();
   }
   
   public void addAccount(String mail, String username, String password,  String role){
       DBUser.addAccount(new Account(mail, username, password, this.getCurrentIdAccount()+1, role));
   }
   
   
   public void addAccount(Account account){
       DBUser.addAccount(account);
   }
   
   //ham can chinh sua
   public boolean updateUser(int iduser,User user){
       String phoneNumber = user.getPhoneNumber();
       String idCard = user.getIdCard();
       
       // check number
        if (phoneNumber.length() != 10 || !phoneNumber.substring(0,1).equals("0")){
            return false;
        }
        
        // check idcard
        if (idCard.length() != 9){
            if (idCard.length() != 12){
                return false;
            }
        }
       
       try {
           DBUser.updateUser(iduser, user);
           return true;
       } catch (Exception e) {
           return false;
       }
       
   }
   
   public User getUserByUserName(String userName){
       for(User user : this.getListUser()){
           if(user.getAccount().getUsername().equals(userName)){
           return user;
           }
       }
       return null;
   }
   
   public boolean updatePassWord(int id,String newPassWord){
      try {
            DBUser.updatePassWord(id, newPassWord);
            return true;
        } catch (Exception e) {
            return false;
        }
   }
   public static User getUserById(int id){
       for(User user : DBUser.getListUsers()){
           if(user.getAccount().getIdAccount() == id){
                return user;
           }
       }
       return null;
   }
}
