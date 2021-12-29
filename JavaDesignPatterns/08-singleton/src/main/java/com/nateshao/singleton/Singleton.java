package com.nateshao.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @date Created by 邵桐杰 on 2021/10/16 23:15
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 * <p>
 * 单例模式的实现
 * <p>
 * 1. 私有构造函数
 * 2. 静态私有成员变量（自身类型）
 * 3. 静态公有的工厂方法
 */
public class Singleton {
    private static Singleton instance = null;  //静态私有成员变量
    private List serverList = null;


    //私有构造函数
    private Singleton() {
        serverList = new ArrayList<>();
    }

    //静态公有工厂方法，返回唯一实例
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    // 添加服务器
    public void addServer(String server) {
        serverList.add(server);
    }

    // 删除服务器
    public void removeServer(String server) {
        serverList.remove(server);
    }
    // 获取任意服务器
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}
