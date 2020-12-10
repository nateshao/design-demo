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
 *              -----0. 静态类使⽤
 */
public class Singleton_00 {

    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();

}
