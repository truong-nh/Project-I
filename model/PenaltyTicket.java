package model;

public class PenaltyTicket extends Ticket{
    private Long Penalty;

    public PenaltyTicket(){
        super();
    }
    public Long getPenalty() {
        return Penalty;
    }
    public void setPenalty(Long penalty) {
        Penalty = penalty;
    }
}
