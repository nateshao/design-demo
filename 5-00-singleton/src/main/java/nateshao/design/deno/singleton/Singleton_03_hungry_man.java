package nateshao.design.deno.singleton;

/**
 * @date Created by 邵桐杰 on 2020/12/10 11:20
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:  饿汉模式(线程安全)
 */
public class Singleton_03_hungry_man {

    private static Singleton_03_hungry_man instance = new Singleton_03_hungry_man();

    private Singleton_03_hungry_man(){

    }
    public static Singleton_03_hungry_man getInstance() {
        return instance;
    }
}
