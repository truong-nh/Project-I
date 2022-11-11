package model;

public class Location {
    private String Room;
    private String Shelf;
    private int Row;

    public Location(){
        
    }
    public String getRoom() {
        return Room;
    }
    public String getShelf() {
        return Shelf;
    }
    public int getRow() {
        return Row;
    }
    public void setRoom(String room) {
        Room = room;
    }
    public void setShelf(String shelf) {
        Shelf = shelf;
    }
    public void setRow(int row) {
        Row = row;
    }
}
