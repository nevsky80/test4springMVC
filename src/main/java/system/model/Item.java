package system.model;

public class Item {

    private int ID;
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Item(int Id,String name) {
        ID = Id;
        Name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                '}';
    }

}
