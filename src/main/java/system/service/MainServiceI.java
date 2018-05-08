package system.service;

import system.model.Item;

import java.util.List;

public interface MainServiceI {

    public List getAllItems();
    public void insert(Item item);

}
