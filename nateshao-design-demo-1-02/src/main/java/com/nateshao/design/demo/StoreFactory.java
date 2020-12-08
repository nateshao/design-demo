package com.nateshao.design.demo;

import com.nateshao.design.demo.store.ICommodity;
import com.nateshao.design.demo.store.impl.CardCommodityService;
import com.nateshao.design.demo.store.impl.CouponCommodityService;
import com.nateshao.design.demo.store.impl.GoodsCommodityService;

/**
 * @date Created by 邵桐杰 on 2020/12/8 19:25
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
