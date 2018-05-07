package system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import system.model.Item;

import javax.sql.DataSource;
import java.util.List;

@Component("ItemDao")
public class ItemDao implements ItemDaoI {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){

        jdbcTemplate = new JdbcTemplate(dataSource);

    }

    public void insert(Item item) {

        String sql="insert into main (name) VALUES(?)";
        jdbcTemplate.update(sql,new Object[] {item.getName()});

    }

    public List<Item> getAllItems(){

        String sql="select * from main";
        return null;

    }

}
