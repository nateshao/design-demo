package com.nateshao.demo;

/**
 * @date Created by 邵桐杰 on 2021/10/10 10:04
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 图表工厂类，充当工厂类
 */
public class ChartFactory {

    /**
     * 静态工厂方法
     *
     * @param type
     * @return
     */
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type == null && type == "") {
            return null;
        }
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }

        if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置折线图！");
        }

        return chart;
    }

}
