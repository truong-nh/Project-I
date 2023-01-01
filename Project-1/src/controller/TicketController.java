/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBBook;
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

    public TicketController() {
    }
    

    public static BorrowTicket getBorrowTicketById(int id){
        for (BorrowTicket BorrowTicket : DBTicket.getListBorrowTicket()){
            if (BorrowTicket.getId() == id) return BorrowTicket;
        }
        return null;
    }
    public static LendTicket getLendTicketById(int id){
        for (LendTicket lendTicket : DBTicket.getListLendTicket()){
            if (lendTicket.getId() == id) return lendTicket;
        }
        return null;
    }
    public static ExtendTicket getExtendTicketByID(int id){
        for (ExtendTicket extendTicket : DBTicket.getListExtendTicket()){
            if (extendTicket.getId() == id) return extendTicket;
        }
        return null;
    }
    public static LendTicket getLendTicketByIdBorrow(int idBorrow){
        for (LendTicket lendTicket : DBTicket.getListLendTicket()){
            if (lendTicket.getBorrowTicket().getId() == idBorrow) return lendTicket;
        }
        return null;
    }
    
        public static ExtendTicket getExtendTicketByIDBorrow(int idborrow){
        for (ExtendTicket extendTicket : DBTicket.getListExtendTicket()){
            if (extendTicket.getBorrowTicket().getId() == idborrow) return extendTicket;
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
    public void addBorrowTicket(String status, int iduser, int idbook, Date borrowedDate){
        BorrowTicket BorrowTicket = new BorrowTicket();
        BorrowTicket.setId(TicketController.getCurrentIdTicket()+1);
        BorrowTicket.setStatus(status);
        BorrowTicket.setDateCreate(new Date());
        BorrowTicket.setBorrower(AccountController.getUserById(iduser));
        BorrowTicket.setBook(BookController.getBookById(idbook));
        BorrowTicket.setBorrowedDate(borrowedDate);
        Date returnDate = new Date(borrowedDate.getTime() + 1209600000);
        BorrowTicket.setReturnDate(returnDate);
        DBTicket.addBorrowTicket(BorrowTicket);
        DBBook.updateStatusBook(idbook, "Đang mượn");           // cap nhat status sach thanh dang muon
    }
    
    // + 7 ngày khi gia hạn sách
    public void updateReturnDateLendTicket(int  idBorrowTicket){
        LendTicket lendTicket = getLendTicketByIdBorrow(idBorrowTicket);
        lendTicket.setLendDate(new Date(lendTicket.getLendDate().getTime()+604800000L));
        this.updateLendTicket(lendTicket);
    }
    public void addExtendTicket(int idticket){
        ExtendTicket ExtendTicket = new ExtendTicket();
        ExtendTicket.setId(TicketController.getCurrentIdTicket()+1);
        ExtendTicket.setStatus("Đã xử lý");
        ExtendTicket.setDateCreate(new Date());
        
        BorrowTicket bT = TicketController.getBorrowTicketById(idticket);        
        ExtendTicket.setBorrowTicket(bT);
        ExtendTicket.setNewReturnDate(new Date(bT.getReturnDate().getTime() + 604800000L));
        DBTicket.addExtendTicket(ExtendTicket);
        LendTicket lendTicket = TicketController.getLendTicketByIdBorrow(idticket);
        lendTicket.setLendDate(new Date(lendTicket.getLendDate().getTime() + 604800000L));
        DBTicket.updateLendTicket(lendTicket);
    }
   
    public void addLendTicket( String status, Date lendDate, int idBorrowTicket){
        LendTicket LendTicket = new LendTicket();
        LendTicket.setId(TicketController.getCurrentIdTicket()+1);
        LendTicket.setStatus(status);
        LendTicket.setDateCreate(new Date());
        LendTicket.setLendDate(lendDate);
        LendTicket.setBorrowTicket(TicketController.getBorrowTicketById(idBorrowTicket));
        DBTicket.addLendTicket(LendTicket);
    }
    public void addPenaltyTicket(long penalty, int idticket){
        PenaltyTicket PenaltyTicket = new PenaltyTicket();
        PenaltyTicket.setId(TicketController.getCurrentIdTicket()+1);
        PenaltyTicket.setStatus("Đã xử lý");
        PenaltyTicket.setDateCreate(new Date());
        PenaltyTicket.setPenalty(penalty);
        PenaltyTicket.setBorrowTicket(TicketController.getBorrowTicketById(idticket));
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
    
    public boolean updateStatusLendTicket(BorrowTicket borrowTicket){
        try {
           LendTicket lendTicket= getLendTicketByIdBorrow(borrowTicket.getId());
           lendTicket.setStatus("Đã xử lý");
           DBTicket.updateLendTicket(lendTicket);
           DBBook.updateStatusBook(borrowTicket.getBook().getId(), "Khả dụng");
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
