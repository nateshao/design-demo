package nateshao.design.demo.prototype;

/**
 * @date Created by 邵桐杰 on 2020/12/10 10:13
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description: 解答题
 */
public class AnswerQuestion {
    private String name;  // 问题
    private String key;   // 答案

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }
}
