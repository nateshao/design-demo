package com.nateshao.singleton;

/**
 * @date Created by 邵桐杰 on 2021/12/29 10:49
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1, singleton2, singleton3, singleton4;
        singleton1 = Singleton.getInstance();
        singleton2 = Singleton.getInstance();
        singleton3 = Singleton.getInstance();
        singleton4 = Singleton.getInstance();
        if (singleton1 == singleton2 && singleton2 == singleton3 && singleton3 == singleton4) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton3.hashCode());
        System.out.println(singleton4.hashCode());

        System.out.println("------------------");
        //添加服务器
        singleton1.addServer("Server 1");
        singleton1.addServer("Server 2");
        singleton1.addServer("Server 3");
        singleton1.addServer("Server 4");

        for (int i = 0; i < 10; i++) {
            String server = singleton1.getServer();
            System.out.println("转发到服务器 " + server);
        }

    }
}
