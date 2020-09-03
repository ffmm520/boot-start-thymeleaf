package com.mimehoo.appdemo.service;

import com.mimehoo.appdemo.dao.GoodsDao;
import com.mimehoo.appdemo.dao.IGoodsDao;
import com.mimehoo.appdemo.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JpaService {
    @Autowired
    private IGoodsDao iGoodsDao;

    // 新增
    public void add(Goods goods) {
        iGoodsDao.save(goods);
    }

    // 删除
    public void remove(Long id) {
        iGoodsDao.deleteById(id);
    }

    //编辑
    public void edit(Goods goods) {
        iGoodsDao.save(goods);
    }

    // 查询
    public Optional<Goods> getById(Long id) {
        return iGoodsDao.findById(id);
    }

    public Iterable<Goods> findAll() {
        return iGoodsDao.findAll();
    }
}
