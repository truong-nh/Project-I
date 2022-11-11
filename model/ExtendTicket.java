package model;

import java.util.Date;

public class ExtendTicket extends Ticket{
    private Date NewReturnDate;
    
    public ExtendTicket(){
        super();
    }
    public Date getNewReturnDate() {
        return NewReturnDate;
    }
    public void setNewReturnDate(Date newReturnDate) {
        NewReturnDate = newReturnDate;
    }
}

