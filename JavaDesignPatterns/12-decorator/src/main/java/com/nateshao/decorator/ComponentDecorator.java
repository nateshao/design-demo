package com.nateshao.decorator;

/**
 * @date Created by 邵桐杰 on 2021/10/20 22:40
 * @微信公众号 程序员千羽
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class ComponentDecorator extends Component {
    private Component component;  //维持对抽象构件类型对象的引用

    //注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}