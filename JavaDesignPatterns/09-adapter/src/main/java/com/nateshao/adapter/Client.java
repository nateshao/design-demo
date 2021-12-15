package com.nateshao.adapter;


/**
 * @date Created by 邵桐杰 on 2021/12/15 15:09
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        CarController car;
        car = (CarController) XMLUtil.getBean();
        car.run();
        car.sound();
        car.twinkle();
    }
}
