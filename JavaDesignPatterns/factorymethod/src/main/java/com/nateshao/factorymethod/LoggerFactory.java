package com.nateshao.factorymethod;

/**
 * @date Created by 邵桐杰 on 2021/10/10 17:06
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 日志记录器工厂接口，充当抽象工厂角色
 */
public interface LoggerFactory {
    public Logger createLogger(); //抽象工厂方法
}

