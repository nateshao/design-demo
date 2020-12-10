package nateshao.design.deno.builder;

import nateshao.design.demo.builder.ceilling.LevelOneCeiling;
import nateshao.design.demo.builder.ceilling.LevelTwoCeiling;
import nateshao.design.demo.builder.coat.DuluxCoat;
import nateshao.design.demo.builder.coat.LiBangCoat;
import nateshao.design.demo.builder.floor.ShengXiangFloor;
import nateshao.design.demo.builder.title.DongPengTile;
import nateshao.design.demo.builder.title.MarcoPoloTile;

/**
 * @date Created by 邵桐杰 on 2020/12/10 9:52
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }
}
