package com.zking.test1.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisTest extends BaseTestCase{

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void test(){
        System.out.println("***********");
        redisTemplate.opsForValue().set("username","ls");
    }


}
