package system.service;

import system.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MainService implements MainServiceI {

    @Autowired
    private ItemDao itemDao;

    public List getAllItems(){
        return itemDao.getAllItems();
    }

}
