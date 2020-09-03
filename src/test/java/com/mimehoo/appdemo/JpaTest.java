package com.mimehoo.appdemo;

import com.mimehoo.appdemo.entity.Goods;
import com.mimehoo.appdemo.service.JpaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class JpaTest {
    @Autowired
    private JpaService jpaService;

    private final Goods goods = new Goods();

    @BeforeEach
    public void newGoods() {
        goods.setName("baboon");
        goods.setPrice("88888");
        goods.setPic("ff.png");
    }

    @Test
    public void add() {
        jpaService.add(goods);
    }
}
