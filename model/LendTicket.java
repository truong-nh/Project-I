package model;

import java.util.Date;

public class LendTicket extends Ticket{
    private Date LendDate;

    public LendTicket(){
        
    }
    public Date getLendDate() {
        return LendDate;
    }
    public void setLendDate(Date lendDate) {
        LendDate = lendDate;
    }
}
