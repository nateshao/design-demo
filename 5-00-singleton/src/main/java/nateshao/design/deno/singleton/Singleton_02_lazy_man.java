package nateshao.design.deno.singleton;

/**
 * @date Created by 邵桐杰 on 2020/12/10 11:15
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:  懒汉模式(线程安全)
 * <p>
 * 此种模式虽然是安全的，但由于把锁加到⽅法上后，所有的访问都因需要锁占⽤导致资源的浪费。
 * 如果不是特殊情况下，不建议此种⽅式实现单例模式。 hungry man
 */
public class Singleton_02_lazy_man {
    private static Singleton_02_lazy_man instance;

    private Singleton_02_lazy_man() {
    }

    public static synchronized Singleton_02_lazy_man getInstance() {
        if (null != instance) {
            return instance;
        }
        return new Singleton_02_lazy_man();
    }

}
