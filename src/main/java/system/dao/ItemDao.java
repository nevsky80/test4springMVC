package system.dao;

import system.model.Item;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class ItemDao implements ItemDaoI {

    private List<Item> items=Arrays.asList(new Item(0,"name1"),new Item(1,"name2"));

    public List<Item> getAllItems(){
        return items;
    }

}
