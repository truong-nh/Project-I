package model;

public class User {
    private String Name;
    private int YearBirthday;
    private String PhoneNumber;
    private String IDcard;

    public User(){
        
    }
    public String getName() {
        return Name;
    }
    public int getYearBirthday() {
        return YearBirthday;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public String getIDcard() {
        return IDcard;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setYearBirthday(int yearBirthday) {
        YearBirthday = yearBirthday;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public void setIDcard(String iDcard) {
        IDcard = iDcard;
    }
}
