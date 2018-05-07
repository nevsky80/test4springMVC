package system.dao;

import system.model.Item;

import java.util.List;

public interface ItemDaoI {

    public List<Item> getAllItems();
    public void insert(Item item);

}
