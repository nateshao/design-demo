package com.nateshao.singleton;

/**
 * @date Created by 邵桐杰 on 2021/10/16 23:15
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 *
 * 单例模式的实现
 *
 * 1. 私有构造函数
 * 2. 静态私有成员变量（自身类型）
 * 3. 静态公有的工厂方法
 */
public class Singleton {
    private static Singleton instance = null;  //静态私有成员变量

    //私有构造函数
    private Singleton() {
    }

    //静态公有工厂方法，返回唯一实例
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
