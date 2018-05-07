package system.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.model.Item;

import java.util.List;

@Service
public class MainService implements MainServiceI {

    @Autowired
    private ItemDao itemDao;

    public List getAllItems(){

        return itemDao.getAllItems();

    }

    public void insert(Item item) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("../../WEB-INF/spring-config.xml");
        //ItemDao itemDao = (ItemDao) context.getBean("ItemDao");
        itemDao.insert(item);

    }
}
