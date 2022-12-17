/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ticket;
import java.util.Date;

/**
 *
 * @author admin
 */
public class BookRequestTicket extends Ticket{
    private Date DateCreate;
    private String Name;
    private String Author;
    public BookRequestTicket() {
        super();
    }
    
    public Date getDateCreate() {
        return DateCreate;
    }

    public void setDateCreate(Date DateCreate) {
        this.DateCreate = DateCreate;
    }
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
