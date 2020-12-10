package nateshao.design.demo.builder.controller;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @date Created by 邵桐杰 on 2020/12/9 20:27
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
class DecorationPackageControllerTest {

    @Test
    public void test_DecorationPackageController() {

            DecorationPackageController decoration = new DecorationPackageController();

            // 豪华欧式
            System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));

            // 轻奢田园
            System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));

            // 现代简约
            System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));

    }
}