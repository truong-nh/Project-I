/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBTicket;
import model.ticket.BorrowTicket;
import model.user.User;

/**
 *
 * @author Admin
 */
public class TicketController {
      private User user;

    public TicketController(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static BorrowTicket getBorrowTicketById(int id){
        for (BorrowTicket BorrowTicket : DBTicket.getListBorrowTicket()){
            if (BorrowTicket.getId() == id) return BorrowTicket;
        }
        return null;
    }
}
