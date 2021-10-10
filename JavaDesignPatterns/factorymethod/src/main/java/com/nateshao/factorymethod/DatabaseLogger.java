package com.nateshao.factorymethod;

/**
 * @date Created by 邵桐杰 on 2021/10/10 17:03
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 数据库日志记录器，充当具体产品角色
 */
public class DatabaseLogger implements Logger {
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}

