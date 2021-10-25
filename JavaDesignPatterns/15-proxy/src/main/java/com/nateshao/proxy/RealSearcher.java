package com.nateshao.proxy;

/**
 * @date Created by 邵桐杰 on 2021/10/25 23:16
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class RealSearcher implements Searcher {
    //模拟查询商务信息
    public String doSearch(String userId, String keyword) {
        System.out.println("用户'" + userId + "'使用关键词'" + keyword + "'查询商务信息！");
        return "返回具体内容";
    }
}
