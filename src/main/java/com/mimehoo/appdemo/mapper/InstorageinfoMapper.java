package com.mimehoo.appdemo.mapper;

import com.mimehoo.appdemo.entity.InstorageInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface InstorageinfoMapper {
    InstorageInfo selectOne(Long id);
}
