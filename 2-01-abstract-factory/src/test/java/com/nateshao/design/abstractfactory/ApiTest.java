package com.nateshao.design.abstractfactory;

import com.nateshao.design.abstractfactory.impl.CacheServiceImpl;
import org.junit.jupiter.api.Test;

/**
 * @date Created by 邵桐杰 on 2020/12/8 23:58
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class ApiTest {
    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);

    }
}
