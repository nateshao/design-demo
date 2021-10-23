package com.nateshao.flyweight.extend;

import com.nateshao.flyweight.simple.IgoChessman;

/**
 * @date Created by 邵桐杰 on 2021/10/23 23:09
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 黑色棋子类：具体享元类
 */
public class BlackIgoChessman extends IgoChessman {
    public String getColor() {
        return "黑色";
    }
}