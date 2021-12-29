package com.nateshao.singleton;

/**
 * @date Created by 邵桐杰 on 2021/10/16 23:18
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 延迟加载
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    /**
     * 多个线程同时访问将导致创建多个单例对象！怎么办？
     * @return
     */
//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }


    /**
     * 锁方法
     * @return
     */
//    synchronized public static LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    /**
     * 锁代码段
     * @return
     */
//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            // 锁代码段
//            synchronized (LazySingleton.class) {
//                instance = new LazySingleton();
//            }
//        }
//        return instance;
//    }

    /**
     * Double-Check Locking  双重检查锁定
     *
     * @return
     */
    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return instance;
    }


}