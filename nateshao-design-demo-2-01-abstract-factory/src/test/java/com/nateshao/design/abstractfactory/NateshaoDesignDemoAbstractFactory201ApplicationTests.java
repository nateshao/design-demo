package com.nateshao.design.abstractfactory;

import com.nateshao.design.abstractfactory.impl.CacheServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class NateshaoDesignDemoAbstractFactory201ApplicationTests {


    @Test
    void contextLoads() {
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("user_name_01", "千羽", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);

    }

}
