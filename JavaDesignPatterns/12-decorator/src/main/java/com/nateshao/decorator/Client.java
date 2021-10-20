package com.nateshao.decorator;

/**
 * @date Created by 邵桐杰 on 2021/10/20 22:28
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class Client {
    public static void main(String args[]) {
        Component component, componentSB, componentBB;  //使用抽象构件定义全部对象
        component = new Window();         //创建具体构件对象
        componentSB = new ScrollBarDecorator(component); //创建装饰后的构件对象
        componentBB = new BlackBorderDecorator(componentSB); //将装饰了一次的对象注入另一个装饰类中，进行第二次装饰
        componentBB.display();
    }
}
