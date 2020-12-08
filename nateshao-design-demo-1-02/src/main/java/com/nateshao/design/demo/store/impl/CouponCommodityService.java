package com.nateshao.design.demo.store.impl;

import com.nateshao.design.demo.coupon.CouponService;
import com.nateshao.design.demo.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @date Created by 邵桐杰 on 2020/12/8 19:31
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class CouponCommodityService implements ICommodity {

    private Logger logger =
            LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

    }
}
