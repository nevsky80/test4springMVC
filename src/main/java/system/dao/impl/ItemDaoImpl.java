package system.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import system.dao.ItemDao;
import system.dao.mapper.ItemRowMapper;
import system.model.Item;

import javax.sql.DataSource;
import java.util.List;

@Repository("ItemDao")
public class ItemDaoImpl implements ItemDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {

        jdbcTemplate = new JdbcTemplate(dataSource);

    }

    public void insert(Item item) {

        String sql = "insert into main (name) VALUES(?)";
        jdbcTemplate.update(sql, item.getName());

    }

    public List<Item> getAllItems() {

        String sql = "select * from main";
        return jdbcTemplate.query(sql, new ItemRowMapper());

    }

    public List<Item> getItemsByName(String name) {

        String sql = "select * from main where name like ?";
        return jdbcTemplate.query(sql, new Object[]{"%"+name+"%"}, new ItemRowMapper());

    }



}
