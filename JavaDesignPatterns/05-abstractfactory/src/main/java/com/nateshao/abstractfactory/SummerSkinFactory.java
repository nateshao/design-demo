package com.nateshao.abstractfactory;


/**
 * @date Created by 邵桐杰 on 2021/10/27 14:42
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }
    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
