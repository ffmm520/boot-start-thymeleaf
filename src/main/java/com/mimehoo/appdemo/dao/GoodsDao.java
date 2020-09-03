package com.mimehoo.appdemo.dao;

import com.mimehoo.appdemo.entity.GoodsDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class GoodsDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 新增商品
     * @param goods 商品信息
     */
    public void insert(GoodsDo goods) {
        jdbcTemplate.update("insert into goods(name, pic, price) values (?, ?, ?)",
                goods.getName(), goods.getPic(), goods.getPrice());
    }


    /**
     * 删除商品
     * @param id 商品id
     */
    public void delete(Long id) {
        jdbcTemplate.update("delete from goods where id = ?", id);
    }

    /**
     * 更新商品
     * @param goods 商品信息
     */
    public void update(GoodsDo goods) {
        jdbcTemplate.update("update goods set name=?,pic =?, price=? where id = ?",
                goods.getName(), goods.getPic(), goods.getPrice(), goods.getId());
    }

    /**
     * 根据id查询商品
     * @param id 商品id
     * @return 商品信息
     */
    public GoodsDo getById(Long id) {
        return jdbcTemplate.queryForObject("select * from goods where id = ?", new RowMapper<GoodsDo>() {
            @Override
            public GoodsDo mapRow(ResultSet rs, int i) throws SQLException {
                GoodsDo goods = new GoodsDo();
                goods.setId(rs.getLong("id"));
                goods.setName(rs.getString("name"));
                goods.setPrice(rs.getString("price"));
                goods.setPic(rs.getString("pic"));
                return goods;
            }
        }, id);
    }

    /**
     * 查询全部商品
     * @return 商品列表
     */
    public List<GoodsDo> getList() {
        return jdbcTemplate.query("select * from goods", new RowMapper<GoodsDo>() {
            @Override
            public GoodsDo mapRow(ResultSet rs, int i) throws SQLException {
                return getGoods(rs, i);
            }
        });
    }

    private GoodsDo getGoods(ResultSet rs, int i) throws SQLException {
        GoodsDo goods = new GoodsDo();
        goods.setId(rs.getLong("id"));
        goods.setName(rs.getString("name"));
        goods.setPrice(rs.getString("price"));
        goods.setPic(rs.getString("pic"));
        return goods;
    }
}
