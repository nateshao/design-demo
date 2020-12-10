package nateshao.design.demo.prototype;

import org.junit.jupiter.api.Test;

/**
 * @date Created by 邵桐杰 on 2020/12/10 10:22
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 以下就是三位考试的试卷； 花花 、 ⾖⾖ 、 ⼤宝 ，每个⼈的试卷内容是⼀样的这没问题，但是三
 *              个⼈的题⽬以及选项顺序都是⼀样，就没有达到我们说希望的乱序要求。
 *              ⽽且以上这样的代码⾮常难扩展，随着题⽬的不断的增加以及乱序功能的补充，都会让这段代码变
 *              得越来越混乱。
 */
class QuestionBankControllerTest {
    @Test
    public void test_QuestionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }
}