/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBFinance;
import java.text.ParseException;
import java.util.Date;
import model.book.Book;
import model.book.Location;
import model.finance.Finance;
import model.user.User;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) throws ParseException {
//        User user= new User();
//        AccountController ac= new AccountController(user);
//        ac.getListUser();
//        // System.out.println(ac.getUserByUserName("truong").getPhoneNumber());
//        System.out.println(ac.getCurrentIdAccount()); 
//        System.out.println(ac.addUser("name", 0, "0111111111", "111111111", "mail@s", "username", "password", "role"));
//        System.out.println(ac.checkErrorCreateAccount("name", 0, "0111111111", "111111111", "mail@s", "username", "password", "role").isEmpty());
        
//        for (Book books : BookController.searchBook("", "", "")){
//            System.out.println(books.getName());
//        }
//      Location location = new Location("8", "8", 8);
//      Book book = new Book(7, "name", "code", "author", "category", Short.valueOf("2002"), "publisher", "status", location);
////      BookController bookController = new BookController();
////      bookController.updateBook(book);
//      FinanceController financeController = new FinanceController();
//     // financeController.addFinance(4444,"thu", "tiền phạt");
//
//     for(Finance finance:financeController.getFinanceReport("2022-12-11", "2022-12-11")){
//        System.out.println(finance.getId());
//        } 
        TicketController ticketController = new TicketController();
        ticketController.updateStatusLendTicket(TicketController.getBorrowTicketById(11));
        System.out.println(TicketController.getTicketById(12).getStatus());
   }
        
}
