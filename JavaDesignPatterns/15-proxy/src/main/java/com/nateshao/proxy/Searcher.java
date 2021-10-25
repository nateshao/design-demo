package com.nateshao.proxy;

/**
 * @date Created by 邵桐杰 on 2021/10/25 23:16
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 抽象查询类：抽象主题类
 */
public interface Searcher {
    public String doSearch(String userId,String keyword);
}