package ru.sbt.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import static java.util.Collections.singletonMap;

@Service
public class PurchaseDaoImpl implements PurchaseDao {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public PurchaseDaoImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Purchase p) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", p.getId());
        params.put("date", p.getDate());
        params.put("cost", p.getCost());
        params.put("shop", p.getShop());

        jdbcTemplate.update("INSERT INTO Purchase(id, date, cost, shop) VALUES(:id, :date, :cost, :shop)", params);
    }

    @Override
    public List<Purchase> find(Date date) {
        return jdbcTemplate.query("SELECT * FROM Purchase WHERE trunc(date) = trunc(:date)", singletonMap("date", date),
                (rs, i) -> new Purchase(rs.getLong("id"), rs.getDate("date"), rs.getDouble("cost"), rs.getString("shop")));
    }
}