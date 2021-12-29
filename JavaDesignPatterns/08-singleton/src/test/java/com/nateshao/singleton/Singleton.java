package com.nateshao.singleton;

/**
 * @date Created by 邵桐杰 on 2021/12/29 9:07
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 * 单例模式的实现
 * 1.静态私有成员变量（自身类型）
 * 2.私有构造函数
 * 3.静态公有的工厂方法: 静态公有工厂方法，返回唯一实例
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}