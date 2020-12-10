package nateshao.design.demo.builder;

/**
 * @date Created by 邵桐杰 on 2020/12/10 9:53
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:  定义装修包接⼝
 *              接⼝类中定义了填充各项物料的⽅法； 吊顶 、 涂料 、 地板 、 地砖 ，
 *              以及最终提供获取全部明细的⽅法。
 */
public interface IMenu {
    /**
     * 吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();
}
