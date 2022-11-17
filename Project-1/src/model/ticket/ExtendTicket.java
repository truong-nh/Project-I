/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ticket;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class ExtendTicket extends Ticket{
    private Date newReturnDate;
    private BorrowTicket borrowTicket;
    public ExtendTicket() {
    }

    public Date getNewReturnDate() {
        return newReturnDate;
    }

    public void setNewReturnDate(Date newReturnDate) {
        this.newReturnDate = newReturnDate;
    }

    public BorrowTicket getBorrowTicket() {
        return borrowTicket;
    }

    public void setBorrowTicket(BorrowTicket borrowTicket) {
        this.borrowTicket = borrowTicket;
    }
    
    
}
