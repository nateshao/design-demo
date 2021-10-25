package com.nateshao.proxy;

/**
 * @date Created by 邵桐杰 on 2021/10/25 23:19
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class Client {
    public static void main(String args[]) {
        Searcher searcher;  //针对抽象编程，客户端无须分辨真实主题类和代理类
        searcher = (Searcher) XMLUtil.getBean();
        String result = searcher.doSearch("杨过", "玉女心经");
    }
}
