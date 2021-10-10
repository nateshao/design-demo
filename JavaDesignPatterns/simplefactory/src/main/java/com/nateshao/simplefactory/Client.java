package com.nateshao.simplefactory;

/**
 * @date Created by 邵桐杰 on 2021/10/10 8:59
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 典型的客户端代码：
 */
public class Client {

    public static void main(String[] args) {
        Product product;
        product = Factory.getProduct("A");
        product.methodDiff();
        product.methodSame();
    }
}
