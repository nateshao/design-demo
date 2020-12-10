package nateshao.design.demo.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @date Created by 邵桐杰 on 2020/12/10 9:52
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 装修包实现
 *              装修包的实现中每⼀个⽅法都会了 this ，也就可以⾮常⽅便的⽤于连续填充各项物料。
 *              同时在填充时也会根据物料计算平⽶数下的报价，吊顶和涂料按照平⽶数适量乘以常熟计算。
 *              最后同样提供了统⼀的获取装修清单的明细⽅法。
 */
public class DecorationPackageMenu implements IMenu{
    private List<Matter> list = new ArrayList<Matter>();  // 装修清单
    private BigDecimal price = BigDecimal.ZERO;      // 装修价格

    private BigDecimal area;  // 面积
    private String grade;     // 装修等级；豪华欧式、轻奢田园、现代简约

    private DecorationPackageMenu() {
    }

    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return (IMenu) this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return (IMenu) this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return (IMenu) this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return (IMenu) this;
    }

    @Override
    public String getDetail() {

        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 平米\r\n" +
                "材料清单：\r\n");

        for (Matter matter: list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append("、").append(matter.model()).append("、平米价格：").append(matter.price()).append(" 元。\n");
        }

        return detail.toString();
    }
}
