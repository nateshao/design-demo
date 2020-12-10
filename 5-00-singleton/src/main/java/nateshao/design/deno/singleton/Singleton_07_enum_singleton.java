package nateshao.design.deno.singleton;

/**
 * @date Created by 邵桐杰 on 2020/12/10 12:40
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 7. Effective Java作者推荐的枚举单例(线程安全)
 *
 *  Effective Java 作者推荐使⽤枚举的⽅式解决单例模式，此种⽅式可能是平时最少⽤到的。
 * 这种⽅式解决了最主要的；线程安全、⾃由串⾏化、单⼀实例。
 */
public enum Singleton_07_enum_singleton {

    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }
}
