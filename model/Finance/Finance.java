package model.Finance;

public class Finance {
    private String ID;
    private Long Value;
    private String Type;
    private java.util.Date Date; //java.sql.Date;

    public Finance(){
        
    }
    public String getID() {
        return ID;
    }
    public Long getValue() {
        return Value;
    }
    public String getType() {
        return Type;
    }
    public java.util.Date getDate() {
        return Date;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public void setValue(Long value) {
        Value = value;
    }
    public void setType(String type) {
        Type = type;
    }
    public void setDate(java.util.Date date) {
        Date = date;
    }
}
