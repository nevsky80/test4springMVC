package system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.ItemDao;
import system.model.Item;
import system.service.MainService;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    private ItemDao itemDao;

    @Autowired
    public MainServiceImpl(ItemDao itemDao) {

        this.itemDao = itemDao;

    }

    public List getAllItems() {

        return itemDao.getAllItems();

    }

    public List getItemsByName(String name) {

        return itemDao.getItemsByName(name);

    }

    public void insert(Item item) {

        itemDao.insert(item);

    }
}
