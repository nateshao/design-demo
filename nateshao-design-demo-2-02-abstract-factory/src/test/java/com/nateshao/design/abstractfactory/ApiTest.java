package com.nateshao.design.abstractfactory;

import com.nateshao.design.abstractfactory.impl.EGMCacheAdapter;
import com.nateshao.design.abstractfactory.impl.IIRCacheAdapter;
import com.nateshao.design.impl.CacheServiceImpl;
import org.junit.jupiter.api.Test;

/**
 * @date Created by 邵桐杰 on 2020/12/9 16:36
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class ApiTest {
    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "千羽的编程时光");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "千羽");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }

}
