package com.mimehoo.appdemo;

import com.mimehoo.appdemo.entity.GoodsDo;
import com.mimehoo.appdemo.mapper.GoodsMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * mybatis 测试
 */
@SpringBootTest
public class MybatisTest {
    @Autowired
    private GoodsMapper goodsMapper;

    private final GoodsDo goods = new GoodsDo();

    @BeforeEach
    public void newGoods() {
        goods.setName("hello-mybatis");
        goods.setPic("mybatis-jpg.gif");
        goods.setPrice("1111.99");
    }

    @Test
    public void insert() {
        goodsMapper.insert(goods);
    }

    @Test
    public void update() {
        goods.setId(1007L);
        goodsMapper.update(goods);
    }
    @Test
    public void delete() {
        goodsMapper.delete(1005L);
    }

    @Test
    public void findOne() {
        GoodsDo goodsDo = goodsMapper.selectOne(1008L);
        System.out.println(goodsDo);
    }

    @Test
    public void findAll() {
        List<GoodsDo> list = goodsMapper.selectAll();
        System.out.println(list);
    }
}
