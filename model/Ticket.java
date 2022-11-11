package model;

import java.util.Date;

public class Ticket {
    private int ID;
    private Date DateCreate;

    public Ticket(){
        
    }
    public int getID() {
        return ID;
    }
    public Date getDateCreate() {
        return DateCreate;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setDateCreate(Date dateCreate) {
        DateCreate = dateCreate;
    }
}
