package com.nateshao.design.nateshaodesigndemo101;

/**
 * @date Created by 邵桐杰 on 2020/12/8 17:34
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class AwardRes {
    private String code; // 编码
    private String info; // 描述

    public AwardRes() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
