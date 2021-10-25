package com.nateshao.proxy;

/**
 * @date Created by 邵桐杰 on 2021/10/25 23:18
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 身份验证类：业务类
 */
public class AccessValidator {

    /**
     * 模拟实现登录验证
     * @param userId
     * @return
     */
    public boolean validate(String userId) {
        System.out.println("在数据库中验证用户'" + userId + "'是否是合法用户？");
        if (userId.equalsIgnoreCase("杨过")) {
            System.out.println("'" + userId + "'登录成功！");
            return true;
        } else {
            System.out.println("'" + userId + "'登录失败！");
            return false;
        }
    }
}
