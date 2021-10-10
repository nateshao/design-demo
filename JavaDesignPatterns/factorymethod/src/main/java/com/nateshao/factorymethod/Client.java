package com.nateshao.factorymethod;

/**
 * @date Created by 邵桐杰 on 2021/10/10 17:01
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class Client {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        //factory = new FileLoggerFactory(); //可引入配置文件实现
        factory = (LoggerFactory) XMLUtil.getBean(); //getBean()的返回类型为Object，需要进行强制类型转换

        logger = factory.createLogger();
        logger.writeLog();
    }
}