package com.nateshao.prototype.deepclone;

/**
 * @date Created by 邵桐杰 on 2021/10/14 22:00
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public class Client {
    public static void main(String args[]) {
        WeeklyLog log_previous, log_new = null;
        log_previous = new WeeklyLog();           //创建原型对象
        Attachment attachment = new Attachment();   //创建附件对象
        log_previous.setAttachment(attachment);     //将附件添加到周报中
        try {
            log_new = log_previous.deepClone(); //调用深克隆方法创建克隆对象
        }
        catch(Exception e) {
            System.err.println("克隆失败！");
        }
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
