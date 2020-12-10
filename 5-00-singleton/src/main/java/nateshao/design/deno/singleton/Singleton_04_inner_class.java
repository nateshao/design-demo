package nateshao.design.deno.singleton;

/**
 * @date Created by 邵桐杰 on 2020/12/10 11:27
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 4. 使⽤类的内部类(线程安全)
 *
 * 使⽤类的静态内部类实现的单例模式，既保证了线程安全有保证了懒加载，同时不会因为加锁的⽅式耗费性能。
 * 这主要是因为JVM虚拟机可以保证多线程并发访问的正确性，也就是⼀个类的构造⽅法在多线程环
 * 境下可以被正确的加载。
 *          此种⽅式也是⾮常推荐使⽤的⼀种单例模式  Double lock check
 */
public class Singleton_04_inner_class {
    private static class SingletonHolder {
        private static Singleton_04_inner_class instance = new Singleton_04_inner_class();
    }

    private Singleton_04_inner_class() {
    }

    public static Singleton_04_inner_class getInstance() {
        return SingletonHolder.instance;
    }
}
