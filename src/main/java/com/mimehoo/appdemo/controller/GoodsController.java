package com.mimehoo.appdemo.controller;

import com.mimehoo.appdemo.entity.GoodsDo;
import com.mimehoo.appdemo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods")
    public List<GoodsDo> getList() {
        return goodsService.getList();
    }

    @GetMapping("/goods/{id}")
    public GoodsDo getById(@PathVariable("id") Long id) {
        return goodsService.getById(id);
    }

    @PostMapping("/goods")
    public void add(@RequestBody GoodsDo goods) {
        goodsService.add(goods);
    }

    @PutMapping("/goods")
    public void edit(@RequestBody GoodsDo goods) {
        goodsService.edit(goods);
    }

    @DeleteMapping("/goods/{id}")
    public void delete(@PathVariable("id") Long id) {
        goodsService.remove(id);
    }
}
