/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBFinance;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import model.finance.Finance;
import model.user.User;
import util.DateUtil;

/**
 *
 * @author Admin
 */
public class FinanceController {
      private User user;

    public FinanceController() {
    }
        
    public FinanceController(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public boolean addFinance(long value,String type , String descripsion){
        try {
            Finance finance = new Finance(DBFinance.getCurrentIdFinance()+1, value, new Date(), type, descripsion);
            DBFinance.addFinance(finance);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
     
    /// yyyy-MM-DD
    public List<Finance> getFinanceReport(String fromDate, String toDate) throws ParseException{
        long fromTime = DateUtil.sdf.parse(fromDate).getTime();
        long endTime = DateUtil.atEndOfDay(DateUtil.sdf.parse(toDate)).getTime();
        return DBFinance.getFinanceReport(fromTime, endTime);
    }
    
    
    
}
