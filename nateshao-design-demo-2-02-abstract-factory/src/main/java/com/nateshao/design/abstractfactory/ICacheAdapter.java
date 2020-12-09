package com.nateshao.design.abstractfactory;

import java.util.concurrent.TimeUnit;

/**
 * @date Created by 邵桐杰 on 2020/12/9 9:00
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 这个类的主要作⽤用是让所有集群的提供⽅方，能在统⼀一的⽅方法名称下进⾏行行操作。
 * 也⽅方⾯面后续的拓拓展。
 */
public class ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
