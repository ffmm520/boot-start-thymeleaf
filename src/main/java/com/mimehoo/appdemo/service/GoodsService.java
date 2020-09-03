package com.mimehoo.appdemo.service;

import com.mimehoo.appdemo.dao.GoodsDao;
import com.mimehoo.appdemo.entity.GoodsDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    // 新增
    public void add(GoodsDo goods){
        goodsDao.insert(goods);
    }

    // 删除
    public void remove(Long id) {
        goodsDao.delete(id);
    }

    // 编辑商品
    public void edit(GoodsDo goods) {
        goodsDao.update(goods);
    }

    // 根据id查询商品
    public GoodsDo getById(Long id) {
        return goodsDao.getById(id);
    }

    // 获取全部商品
    public List<GoodsDo> getList() {
        return goodsDao.getList();
    }

}
