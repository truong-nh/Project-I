package model.Ticket;

import java.util.Date;

import model.Book.Book;
import model.User.User;

public class BorrowTicket extends Ticket{
    private User Borrower;
    private Book Book;
    private Date BorrowedDate;
    private Date ReturnDate;

    public BorrowTicket(){
        super();
    }
    public User getBorrower() {
        return Borrower;
    }
    public Book getBook() {
        return Book;
    }
    public Date getBorrowedDate() {
        return BorrowedDate;
    }
    public Date getReturnDate() {
        return ReturnDate;
    }
    public void setBorrower(User borrower) {
        Borrower = borrower;
    }
    public void setBook(Book book) {
        Book = book;
    }
    public void setBorrowedDate(Date borrowedDate) {
        BorrowedDate = borrowedDate;
    }
    public void setReturnDate(Date returnDate) {
        ReturnDate = returnDate;
    }
}
