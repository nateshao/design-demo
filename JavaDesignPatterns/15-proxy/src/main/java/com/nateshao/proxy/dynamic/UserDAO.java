package com.nateshao.proxy.dynamic;

/**
 * @date Created by 邵桐杰 on 2021/10/25 23:24
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 具体UserDAO类：真实角色
 */
public class UserDAO implements AbstractUserDAO {
    public Boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("张无忌")) {
            System.out.println("查询ID为" + userId + "的用户信息成功！");
            return true;
        } else {
            System.out.println("查询ID为" + userId + "的用户信息失败！");
            return false;
        }
    }
}
