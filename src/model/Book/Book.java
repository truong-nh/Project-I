package model.Book;

public class Book {
    private int ID;
    private String Name;
    private String Code;
    private String Author;
    private String Category;
    private Short Year;
    private String Publisher;
    private String Status;
    
    public Book(){
        
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public String getCode() {
        return Code;
    }
    public String getAuthor() {
        return Author;
    }
    public String getCategory() {
        return Category;
    }
    public Short getYear() {
        return Year;
    }
    public String getPublisher() {
        return Publisher;
    }
    public String getStatus() {
        return Status;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setCode(String code) {
        Code = code;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public void setYear(Short year) {
        Year = year;
    }
    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
    public void setStatus(String status) {
        Status = status;
    }
}
