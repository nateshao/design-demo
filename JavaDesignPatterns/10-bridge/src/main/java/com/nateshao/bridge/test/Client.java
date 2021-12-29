package com.nateshao.bridge.test;

import com.nateshao.bridge.Image;
import com.nateshao.bridge.ImageImp;
import com.nateshao.bridge.XMLUtil;

/**
 * @date Created by 邵桐杰 on 2021/10/19 20:26
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 客户端测试类
 */
public class Client {
    public static void main(String args[]) {
        Image image;
        ImageImp imp;
        image = (Image) XMLUtil.getBean("image");
        imp = (ImageImp) XMLUtil.getBean("os");
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
