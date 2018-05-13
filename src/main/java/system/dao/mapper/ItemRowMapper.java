package system.dao.mapper;


import org.springframework.jdbc.core.RowMapper;
import system.model.Item;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class ItemRowMapper implements RowMapper<Item> {

    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
        Item item = new Item();
        item.setId(rs.getInt("id"));
        item.setName(rs.getString("name"));
        return item;
    }

}
