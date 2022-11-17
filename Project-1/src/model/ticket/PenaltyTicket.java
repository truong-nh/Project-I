/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ticket;

/**
 *
 * @author Admin
 */
public class PenaltyTicket extends Ticket{
    private long penanty;
    private BorrowTicket borrowTicket;

    public PenaltyTicket() {
    }

    public long getPenanty() {
        return penanty;
    }

    public void setPenanty(long penanty) {
        this.penanty = penanty;
    }

    public BorrowTicket getBorrowTicket() {
        return borrowTicket;
    }

    public void setBorrowTicket(BorrowTicket borrowTicket) {
        this.borrowTicket = borrowTicket;
    }
    
    
}
