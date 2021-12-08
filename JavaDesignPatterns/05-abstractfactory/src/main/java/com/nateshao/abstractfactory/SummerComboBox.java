package com.nateshao.abstractfactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @date Created by 邵桐杰 on 2021/10/27 14:49
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}
