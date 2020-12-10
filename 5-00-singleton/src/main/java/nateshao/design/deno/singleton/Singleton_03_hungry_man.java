package nateshao.design.deno.singleton;

/**
 * @date Created by 邵桐杰 on 2020/12/10 11:20
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:  饿汉模式(线程安全)
 * <p>
 * 此种⽅式与我们开头的第⼀个实例化 Map 基本⼀致，在程序启动的时候直接运⾏加载，后续有外
 * 部需要使⽤的时候获取即可。 Inner class
 * 但此种⽅式并不是懒加载，也就是说⽆论你程序中是否⽤到这样的类都会在程序启动之初进⾏创建。
 * 那么这种⽅式导致的问题就像你下载个游戏软件，可能你游戏地图还没有打开呢，但是程序已经将
 * 这些地图全部实例化。到你⼿机上最明显体验就⼀开游戏内存满了，⼿机卡了，需要换了。
 */
public class Singleton_03_hungry_man {

    private static Singleton_03_hungry_man instance = new Singleton_03_hungry_man();

    private Singleton_03_hungry_man() {

    }

    public static Singleton_03_hungry_man getInstance() {
        return instance;
    }
}
