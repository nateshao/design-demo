package com.nateshao.design.abstractfactory.cuisine.impl;

import com.nateshao.design.abstractfactory.CacheService;
import com.nateshao.design.abstractfactory.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @date Created by 邵桐杰 on 2020/12/8 23:40
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }
    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }
    @Override
    public void del(String key) {
        redisUtils.del(key);
    }

}