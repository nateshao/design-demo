package com.nateshao.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @date Created by 邵桐杰 on 2021/10/25 23:27
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class Client {
    public static void main(String args[]) {
        InvocationHandler handler = null;
        AbstractUserDAO userDAO = new UserDAO();
        handler = new DAOLogHandler(userDAO);
        AbstractUserDAO proxy = null;

        //动态创建代理对象，用于代理一个AbstractUserDAO类型的真实主题对象
        proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[]{AbstractUserDAO.class}, handler);
        proxy.findUserById("张无忌"); //调用代理对象的业务方法

        System.out.println("------------------------------");

        AbstractDocumentDAO docDAO = new DocumentDAO();
        handler = new DAOLogHandler(docDAO);
        AbstractDocumentDAO proxy_new = null;

        //动态创建代理对象，用于代理一个AbstractDocumentDAO类型的真实主题对象
        proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[]{AbstractDocumentDAO.class}, handler);
        proxy_new.deleteDocumentById("D002"); //调用代理对象的业务方法
    }
}
