package com.nateshao.proxy;

/**
 * @date Created by 邵桐杰 on 2021/10/25 23:18
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 日志记录类：业务类
 */
public class Logger {
    //模拟实现日志记录
    public void log(String userId) {
        System.out.println("更新数据库，用户'" + userId + "'查询次数加1！");
    }
}