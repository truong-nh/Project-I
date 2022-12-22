/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ticket;
import java.util.Date;
import model.user.User;

/**
 *
 * @author admin
 */
public class BookRequestTicket extends Ticket{
    private String Name;
    private String Author;
//    private User Requester;
    public BookRequestTicket() {
        super();
    }
//    public void setRequester(User Requester) {
//        this.Requester = Requester;
//    }
//    public User getRequester() {
//        return Requester;
//    }
    public String getName(){
        return Name;
    }
    public String getAuthor(){
        return Author;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    } 
}
