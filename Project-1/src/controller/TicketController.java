/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBTicket;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.book.Book;
import model.ticket.BookRequestTicket;
import model.ticket.BorrowTicket;
import model.ticket.ExtendTicket;
import model.ticket.LendTicket;
import model.ticket.PenaltyTicket;
import model.ticket.Ticket;
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
    public static int getCurrentIdTicket(){
        int maxz = 0;
        for (BorrowTicket BorrowTicket : DBTicket.getListBorrowTicket()){
            maxz = Math.max(BorrowTicket.getId(),maxz);
        }
        for (BookRequestTicket BookRequestTicket : DBTicket.getListBookRequestTicket()){
            maxz = Math.max(BookRequestTicket.getId(),maxz);
        }
        for (ExtendTicket ExtendTicket : DBTicket.getListExtendTicket()){
            maxz = Math.max(ExtendTicket.getId(),maxz);
        }
        for (LendTicket LendTicket : DBTicket.getListLendTicket()){
            maxz = Math.max(LendTicket.getId(),maxz);
        }
        for (PenaltyTicket PenaltyTicket : DBTicket.getListPenaltyTicket()){
            maxz = Math.max(PenaltyTicket.getId(),maxz);
        }
        return maxz;
    }
    
    
    //get ticket
    public static Ticket getTicketById(int id){
        for (BorrowTicket BorrowTicket : DBTicket.getListBorrowTicket()){
            if (BorrowTicket.getId() == id) return BorrowTicket;
        }
        for (BookRequestTicket BookRequestTicket : DBTicket.getListBookRequestTicket()){
            if (BookRequestTicket.getId() == id) return BookRequestTicket;
        }
        for (ExtendTicket ExtendTicket : DBTicket.getListExtendTicket()){
            if (ExtendTicket.getId() == id) return ExtendTicket;
        }
        for (LendTicket LendTicket : DBTicket.getListLendTicket()){
            if (LendTicket.getId() == id) return LendTicket;
        }
        for (PenaltyTicket PenaltyTicket : DBTicket.getListPenaltyTicket()){
            if (PenaltyTicket.getId() == id) return PenaltyTicket;
        }
        return null;
    }
    public static List<Ticket> getTicketByUserId(int id){
        List<Ticket> tickets = new ArrayList<>();
        for (BorrowTicket BorrowTicket : DBTicket.getListBorrowTicket()){
            if (BorrowTicket.getBorrower().getAccount().getIdAccount() == id) tickets.add(BorrowTicket);
        }
//        for (BookRequestTicket BookRequestTicket : DBTicket.getListBookRequestTicket()){
//            if (BookRequestTicket.getId() == id) tickets.add(BookRequestTicket);
//        }
        for (ExtendTicket ExtendTicket : DBTicket.getListExtendTicket()){
            if (ExtendTicket.getBorrowTicket().getBorrower().getAccount().getIdAccount() == id) tickets.add(ExtendTicket);
        }
        for (LendTicket LendTicket : DBTicket.getListLendTicket()){
            if (LendTicket.getBorrowTicket().getBorrower().getAccount().getIdAccount() == id) tickets.add(LendTicket);
        }
        for (PenaltyTicket PenaltyTicket : DBTicket.getListPenaltyTicket()){
            if (PenaltyTicket.getBorrowTicket().getBorrower().getAccount().getIdAccount() == id) tickets.add(PenaltyTicket);
        }
        return tickets;
    }
    
    //add ticket
    public void addBorrowTicket(int id, String status, Date dateCreate, User borrower, Book book, Date borrowedDate, Date returnDate){
        BorrowTicket BorrowTicket = new BorrowTicket();
        BorrowTicket.setId(id);
        BorrowTicket.setStatus(status);
        BorrowTicket.setDateCreate(dateCreate);
        BorrowTicket.setBorrower(borrower);
        BorrowTicket.setBook(book);
        BorrowTicket.setBorrowedDate(borrowedDate);
        BorrowTicket.setReturnDate(returnDate);
        DBTicket.addBorrowTicket(BorrowTicket);
    }
    public void addExtendTicket(int id, String status, Date dateCreate, Date newReturnDate, BorrowTicket borrowTicket){
        ExtendTicket ExtendTicket = new ExtendTicket();
        ExtendTicket.setId(id);
        ExtendTicket.setStatus(status);
        ExtendTicket.setDateCreate(dateCreate);
        ExtendTicket.setBorrowTicket(borrowTicket);
        ExtendTicket.setNewReturnDate(newReturnDate);
        DBTicket.addExtendTicket(ExtendTicket);
    }
    public void addLendTicket(int id, String status, Date dateCreate, Date lendDate, BorrowTicket borrowTicket){
        LendTicket LendTicket = new LendTicket();
        LendTicket.setId(id);
        LendTicket.setStatus(status);
        LendTicket.setDateCreate(dateCreate);
        LendTicket.setLendDate(lendDate);
        LendTicket.setBorrowTicket(borrowTicket);
        DBTicket.addLendTicket(LendTicket);
    }
    public void addPenaltyTicket(int id, String status, Date dateCreate, long penalty, BorrowTicket borrowTicket){
        PenaltyTicket PenaltyTicket = new PenaltyTicket();
        PenaltyTicket.setId(id);
        PenaltyTicket.setStatus(status);
        PenaltyTicket.setDateCreate(dateCreate);
        PenaltyTicket.setPenalty(penalty);
        PenaltyTicket.setBorrowTicket(borrowTicket);
        DBTicket.addPenaltyTicket(PenaltyTicket);
    }
    
    //update ticket
    public boolean updateBorrowTicket(BorrowTicket BorrowTicket){
        try {
           DBTicket.updateBorrowTicket(BorrowTicket);
           return true;
       } catch (Exception e) {
           return false;
       }
    } 
    public boolean updateExtendTicket(ExtendTicket ExtendTicket){
        try {
           DBTicket.updateExtendTicket(ExtendTicket);
           return true;
       } catch (Exception e) {
           return false;
       }
    }
    public boolean updatePenaltyTicket(PenaltyTicket PenaltyTicket){
        try {
           DBTicket.updatePenaltyTicket(PenaltyTicket);
           return true;
       } catch (Exception e) {
           return false;
       }
    }
    public boolean updateLendTicket(LendTicket LendTicket){
        try {
           DBTicket.updateLendTicket(LendTicket);
           return true;
       } catch (Exception e) {
           return false;
       }
    }
    public boolean updateBookRequestTicket(BookRequestTicket BookRequestTicket){
        try {
           DBTicket.updateBookRequestTicket(BookRequestTicket);
           return true;
       } catch (Exception e) {
           return false;
       }
    }
}
