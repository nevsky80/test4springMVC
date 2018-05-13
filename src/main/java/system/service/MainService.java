package system.service;

import system.model.Item;

import java.util.List;

public interface MainService {

    List getAllItems();

    void insert(Item item);

    List getItemsByName(String name);

}
