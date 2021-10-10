package com.nateshao.factorymethod;

/**
 * @date Created by 邵桐杰 on 2021/10/10 17:08
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 文件日志记录器，充当具体产品角色
 */
public class FileLogger implements Logger {
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
