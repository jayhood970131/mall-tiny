package com.jayhood.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.jayhood.mall.mbg.mapper", "com.jayhood.mall.dao"})
public class MyBatisConfig {
}

