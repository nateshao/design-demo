package com.nateshao.design.abstractfactory;

import com.nateshao.design.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @date Created by 邵桐杰 on 2020/12/9 9:00
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 在代理理类的实现中其实也⾮非常简单，通过穿透进来的集群服务进⾏行行⽅方法操作。
 * 另外在invoke中通过使⽤用获取⽅方法名称反射⽅方式，调⽤用对应的⽅方法功能，也就简化了了整体的使⽤用。
 * 到这我们就已经将整体的功能实现完成了了，关于抽象⼯工⼚厂这部分也可以使⽤用⾮非代理理的⽅方式进⾏行行实现
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);

    }
}
