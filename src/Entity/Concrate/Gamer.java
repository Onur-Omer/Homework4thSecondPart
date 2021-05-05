package Entity.Concrate;

import Entity.Abstract.Entity;

public class Gamer implements Entity {

    private String TcNo;
    private String FirstName;
    private String LastName;
    private int BirthYear;

    public Gamer(String tcNo, String firstName, String lastName, int birthYear) {
        TcNo = tcNo;
        FirstName = firstName;
        LastName = lastName;
        BirthYear = birthYear;
    }

    public Gamer() {

    }


    public String getTcNo() {
        return TcNo;
    }

    public void setTcNo(String tcNo) {
        TcNo = tcNo;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
    }
}
