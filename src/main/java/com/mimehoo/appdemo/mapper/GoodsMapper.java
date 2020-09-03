package com.mimehoo.appdemo.mapper;

import com.mimehoo.appdemo.entity.GoodsDo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    /**
     * 新增商品
     * @param goodsDo 商品信息
     * @return 影响行数
     */
    int insert(GoodsDo goodsDo);

    /**
     * 删除商品
     * @param id 商品id
     * @return 影响行数
     */
    int delete(Long id);

    /**
     * 更新商品
     * @param goodsDo 商品信息
     * @return 影响行数
     */
    int update(GoodsDo goodsDo);

    /**
     * 查询一条商品
     * @param id 商品id
     * @return 商品信息
     */
    GoodsDo selectOne(Long id);

    /**
     * 查询全部商品
     * @return 商品列表
     */
    List<GoodsDo> selectAll();
}
