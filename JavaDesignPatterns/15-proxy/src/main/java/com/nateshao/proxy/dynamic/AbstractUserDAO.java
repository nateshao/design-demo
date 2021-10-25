package com.nateshao.proxy.dynamic;

/**
 * @date Created by 邵桐杰 on 2021/10/25 23:24
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
//抽象UserDAO：抽象主题角色
public interface AbstractUserDAO {
    public Boolean findUserById(String userId);
}
