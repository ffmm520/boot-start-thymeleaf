package com.mimehoo.appdemo;

import com.mimehoo.appdemo.dao.GoodsDao;
import com.mimehoo.appdemo.entity.GoodsDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class SpringbootStartDemoApplicationTests {
	@Autowired
	private DataSource dataSource;

	@Autowired
	private GoodsDao goodsDao;

	@Test
	void contextLoads() {
	}

	/**
	 * 测试插入1000条数据的时间
	 */
	@Test void insertBatch() {
		System.out.println(dataSource);
		long start = System.currentTimeMillis();
		GoodsDo goods = new GoodsDo();
		goods.setName("sony 9500H");
		goods.setPic("good.jpg");
		goods.setPrice("9999");
		for (int i = 0; i < 1000; i++) {
			goodsDao.insert(goods);
		}
		System.out.println("use time:" + (System.currentTimeMillis() - start)+"ms");
	}

}
