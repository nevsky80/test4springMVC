package system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import system.model.Item;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        String sql = "select * from main";
        return jdbcTemplate.query(sql,new ItemRowMapper());

    }

    public List<Item> getItemsByName(String name){

        String sql = "select * from main where name like ?";
        return jdbcTemplate.query(sql, new Object[] {name}, new ItemRowMapper());

    }

    private static final class ItemRowMapper implements RowMapper<Item> {

        public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
            Item item = new Item();
            item.setId(rs.getInt("id"));
            item.setName(rs.getString("name"));
            return item;
        }

    }


}
