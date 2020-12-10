package nateshao.design.deno.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @date Created by 邵桐杰 on 2020/12/10 11:02
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 7种单例模式实现
 *              ----- 0. 静态类使⽤
 * 以上这种⽅式在我们平常的业务开发中⾮常场常⻅，这样静态类的⽅式可以在第⼀次运⾏的时候直
 * 接初始化Map类，同时这⾥我们也不需要到延迟加载在使⽤。
 * 在不需要维持任何状态下，仅仅⽤于全局访问，这个使⽤使⽤静态类的⽅式更加⽅便。
 * 但如果需要被继承以及需要维持⼀些特定状态的情况下，就适合使⽤单例模式。
 */
public class Singleton_00_static {

    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();

}
