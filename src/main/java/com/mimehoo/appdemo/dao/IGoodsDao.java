package com.mimehoo.appdemo.dao;

import com.mimehoo.appdemo.entity.Goods;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGoodsDao extends CrudRepository<Goods, Long> {
}
