package nateshao.design.deno.singleton;

/**
 * @date Created by 邵桐杰 on 2020/12/10 11:27
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 4. 使⽤类的内部类(线程安全)
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
