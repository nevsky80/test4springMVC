package system.model;

public class Item {

    private String Name;

    public String getName() {

        return Name;

    }

    public void setName(String name) {
        Name = name;
    }

    public Item(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Name='" + Name + '\'' +
                '}';
    }

}
