/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.book;

/**
 *
 * @author Admin
 */
public class Book {
    private int id;
    private String name;
    private String code;
    private String author;
    private String category;
    private Short year;
    private String publisher;
    private String status;
    private Location location;

    public Book(int id, String name, String code, String author, String category, Short year, String publisher, String status, Location location) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.author = author;
        this.category = category;
        this.year = year;
        this.publisher = publisher;
        this.status = status;
        this.location = location;
    }
    public Book(int id, String name, String code, String author, String category, Short year, String publisher, String status, String room, String shelf, int row) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.author = author;
        this.category = category;
        this.year = year;
        this.publisher = publisher;
        this.status = status;
        Location location = new Location(room, shelf, row);
        this.location = location;
    }
    public Book() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    
}
