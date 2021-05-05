package Entity.Concrate;

import Entity.Abstract.Entity;

public class Campaign implements Entity {
    private int Id;
    private String Name;
    private int Discount;

    public Campaign(String name, int discount,int Id) {
        Name = name;
        Discount = discount;
        this.setId(Id);
    }

    public Campaign() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
