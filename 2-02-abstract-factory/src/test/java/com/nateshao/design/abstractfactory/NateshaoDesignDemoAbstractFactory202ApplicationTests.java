package com.nateshao.design.abstractfactory;

import com.nateshao.design.abstractfactory.impl.EGMCacheAdapter;
import com.nateshao.design.abstractfactory.impl.IIRCacheAdapter;
import com.nateshao.design.impl.CacheServiceImpl;
import org.junit.jupiter.api.Test;


class NateshaoDesignDemoAbstractFactory202ApplicationTests {


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
