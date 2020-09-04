package com.mimehoo.appdemo;

import com.mimehoo.appdemo.entity.InstorageInfo;
import com.mimehoo.appdemo.mapper.InstorageinfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InstorageTest {
    @Autowired
    private InstorageinfoMapper instorageinfoMapper;

    @Test
    public void selectOne(){
        InstorageInfo instorageInfo = instorageinfoMapper.selectOne(235520L);
        System.out.println(instorageInfo);
    }
}
