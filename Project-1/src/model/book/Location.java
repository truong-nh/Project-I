/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.book;

/**
 *
 * @author Admin
 */
public class Location {
    private String room;
    private String shelf;
    private int row;

    public Location() {
    }
    
    public Location(String room, String shelf, int row) {
        this.room = room;
        this.shelf = shelf;
        this.row = row;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    public String getLocation(){
        String location = room +"-"+shelf+"-"+row;
        return location;
    }
    
}

