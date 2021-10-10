package com.nateshao.demo;

/**
 * @date Created by 邵桐杰 on 2021/10/10 11:26
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;
        ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品
        String type = XMLUtil.getChartType();//读取配置文件中的参数
        chart = ChartFactory.getChart(type); // 创建产品对象
        chart.display();
    }
}
