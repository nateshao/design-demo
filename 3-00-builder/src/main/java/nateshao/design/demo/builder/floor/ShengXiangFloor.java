package nateshao.design.demo.builder.floor;

import nateshao.design.demo.builder.Matter;

import java.math.BigDecimal;

/**
 * @author 邵桐杰
 * @date Created by 邵桐杰 on 2020/12/9 17:31
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 地板
 *              品牌：圣象
 */
public class ShengXiangFloor implements Matter {

    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "圣象地板是中国地板行业著名品牌。圣象地板拥有中国驰名商标、中国名牌、国家免检、中国环境标志认证等多项荣誉。";
    }
}
