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
//具体DocumentDAO类：真实角色
public class DocumentDAO implements AbstractDocumentDAO {
    public Boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("D001")) {
            System.out.println("删除ID为" + documentId + "的文档信息成功！");
            return true;
        }
        else {
            System.out.println("删除ID为" + documentId + "的文档信息失败！");
            return false;
        }
    }
}