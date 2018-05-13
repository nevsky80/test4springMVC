package system.dao;

import system.model.Item;

import java.util.List;

public interface ItemDao {

    List<Item> getAllItems();

    void insert(Item item);

    List<Item> getItemsByName(String name);

}
