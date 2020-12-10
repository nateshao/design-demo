package nateshao.design.deno.singleton;

/**
 * @date Created by 邵桐杰 on 2020/12/10 11:35
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 双重锁校验(线程安全)
 *
 * 双重锁的⽅式是⽅法级锁的优化，减少了部分获取实例的耗时。
 * 同时这种⽅式也满⾜了懒加载。  6. CAS「AtomicReference」(线程安全)
 */
public class Singleton_05_double_lock_check {
    private static Singleton_05_double_lock_check instance;

    private Singleton_05_double_lock_check() {
    }

    public static Singleton_05_double_lock_check getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton_05_double_lock_check.class) {
            if (null == instance) {
                instance = new Singleton_05_double_lock_check();
            }
        }
        return instance;
    }
}
