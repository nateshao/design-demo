package com.nateshao.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @date Created by 邵桐杰 on 2021/12/29 10:40
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class Singleton {
    private static Singleton instance = null;

    private List serverList = null;

    private Singleton() {
        serverList = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
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

    // 获取任意
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }


}
