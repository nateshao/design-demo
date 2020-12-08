package com.nateshao.design.nateshaodesigndemo101;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * @date Created by 邵桐杰 on 2020/12/8 17:44
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 单元测试类
 */
public class PrizeControllerTest {

    private Logger logger = LoggerFactory.getLogger(PrizeControllerTest.class);

    @Test
    public void test_awardToUser(){
        PrizeController prizeController = new PrizeController();
        System.out.println("\\r\\n模拟发放优惠券测试\\r\\n");
        // 模拟发放优惠券测试
        AwardReq req01 = new AwardReq();
        req01.setuId("10001");
        req01.setAwardType(1);
        req01.setAwardNumber("EGM1023938910232121323432");
        req01.setBizId("791098764902132");

    }

}