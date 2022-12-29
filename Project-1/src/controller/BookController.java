/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBBook;
import database.DBUser;
import java.util.ArrayList;
import java.util.List;
import model.book.Book;
import model.book.Location;
import model.user.User;

/**
 *
 * @author Admin
 */
public class BookController {
    private User user;

    public BookController(User user) {
        this.user = user;
    }

    public BookController() {
    }
    
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public int getCurrentIdBook(){
        int maxIdCurrent=0;
        for(Book book:DBBook.getListBooks()){
            if(book.getId() > maxIdCurrent ){
                maxIdCurrent= book.getId();
            }
        }
        return  maxIdCurrent;
    }

    public boolean addBook(Book book){
        try {
           DBBook.addBook(book);
           return true;
       } catch (Exception e) {
           return false;
       }
    } 
    
    public void addBook(String name, String code, String author,  String category, Short year, String publisher, String status, Location location){
       DBBook.addBook(new Book(this.getCurrentIdBook()+1, name, code, author, category, year, publisher, status, location));
    }
    
    public List<Book> getListBooks(){
       return DBBook.getListBooks();
    }
    
    public boolean updateBook(Book book){
        try {
           DBBook.updateBook(book);
           return true;
       } catch (Exception e) {
           return false;
          
       }
    } 
    
    
    public static Book getBookById(int id){
        //Book books = new Book();
        for (Book book : DBBook.getListBooks()){
            if (book.getId() == id) return  book;
        }
        return null;
    }
    
    public static List<Book> searchBook(String name, String author, String category){
        List<Book> books = new ArrayList<>();
        
        for (Book book : DBBook.getListBooks()){
            boolean check = true;
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("name");
            cars.add("author");
            cars.add("category");
            for (int i = 0; i < cars.size(); i++) {
                if ("name".equals(cars.get(i))){
                    if (name.equals("")){
                        continue;
                    }
                    if (!book.getName().equals(name)){
                        check = false;
                    }
                }
                if ("author".equals(cars.get(i))){
                    if (author.equals("")){
                        continue;
                    }
                    if (!book.getAuthor().equals(author)){
                        check = false;
                    }
                }
                if ("category".equals(cars.get(i))){
                    if (category.equals("")){
                        continue;
                    }
                    if (!book.getCategory().equals(category)){
                        check = false;
                    }
                }
            }
            if (check) books.add(book);
        }
        return books;
    }
}
