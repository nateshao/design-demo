package nateshao.design.deno.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @date Created by 邵桐杰 on 2020/12/10 11:40
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:  6. CAS「AtomicReference」(线程安全)
 *
 * java并发库提供了很多原⼦类来⽀持并发访问的数据安全
 * 性； AtomicInteger 、 AtomicBoolean 、 AtomicLong 、 AtomicReference 。
 * AtomicReference 可以封装引⽤⼀个V实例，⽀持并发访问如上的单例⽅式就是使⽤了这样的⼀个
 * 特点。
 * 使⽤CAS的好处就是不需要使⽤传统的加锁⽅式保证线程安全，⽽是依赖于CAS的忙等算法，依赖
 * 于底层硬件的实现，来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了额外
 * 的开销，并且可以⽀持较⼤的并发性。
 * 当然CAS也有⼀个缺点就是忙等，如果⼀直没有获取到将会处于死循环中。
 */
public class Singleton_06_CAS_AtomicReference {

    private static final AtomicReference<Singleton_06_CAS_AtomicReference> INSTANCE = new AtomicReference<Singleton_06_CAS_AtomicReference>();

    private static Singleton_06_CAS_AtomicReference instance;

    private Singleton_06_CAS_AtomicReference() {
    }

    public static final Singleton_06_CAS_AtomicReference getInstance() {
        for (; ; ) {
            Singleton_06_CAS_AtomicReference instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_06_CAS_AtomicReference());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_06_CAS_AtomicReference.getInstance()); // org.itstack.demo.design.Singleton_06@2b193f2d
        System.out.println(Singleton_06_CAS_AtomicReference.getInstance()); // org.itstack.demo.design.Singleton_06@2b193f2d
    }
}
