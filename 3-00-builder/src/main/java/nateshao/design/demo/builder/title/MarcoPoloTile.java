package nateshao.design.demo.builder.title;

import nateshao.design.demo.builder.Matter;

import java.math.BigDecimal;

/**
 * @author 邵桐杰
 * @date Created by 邵桐杰 on 2020/12/9 17:33
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: ⻢可波罗
 *
 */
public class MarcoPoloTile implements Matter {

    @Override
    public String scene() {
        return "地砖";
    }
    @Override
    public String brand() {
        return "马可波罗(MARCO POLO)";
    }
    @Override
    public String model() {
        return "缺省";
    }
    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "“马可波罗”品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }

}
