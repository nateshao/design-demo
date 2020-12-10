package nateshao.design.demo.singleton;

import org.junit.jupiter.api.Test;

/**
 * @date Created by 邵桐杰 on 2020/12/10 12:42
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 *  这种写法在功能上与共有域⽅法相近，但是它更简洁，⽆偿地提供了串⾏化机制，绝对防⽌对此实例
 * 化，即使是在⾯对复杂的串⾏化或者反射攻击的时候。虽然这中⽅法还没有⼴泛采⽤，但是单元素的枚
 * 举类型已经成为实现Singleton的最佳⽅法。
 * 但也要知道此种⽅式在存在继承场景下是不可⽤的。
 */
class ApiTest {

    @Test
    public void test(){
        Singleton_07_enum_singleton.INSTANCE.test();
    }

}