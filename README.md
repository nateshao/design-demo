#  Java 设计模式

> **作者：** 邵桐杰，Java Developer，[:pencil2: 千羽的编程时光 · 科技栈，作者](https://nateshao.gitee.io)


<br/>

<div align="center">
    <a href="https://nateshao.gitee.io" style="text-decoration:none"><img src="https://bugstack.cn/assets/images/icon.svg" width="128px"></a>
</div>

<br/>  

<div align="center">
<a href="https://github.com/nateshao/nateshao-design-demo"><img src="https://badgen.net/github/license/nateshao/nateshao-design-demo?icon=github&color=4ab8a1"></a>
<a href="https://github.com/nateshao/nateshao-design-demo" target="_blank"><img src="https://bugstack.cn/assets/images/onlinebook.svg"></a>
<a href="https://s3.ax1x.com/2020/12/08/rpgPKO.jpg"><img src="https://img.shields.io/badge/%E5%85%AC%E4%BC%97%E5%8F%B7-%E5%8D%83%E7%BE%BD%E7%9A%84%E7%BC%96%E7%A8%8B%E6%97%B6%E5%85%89-brightgreen"></a>
</div>
<br/>
<br/>
<br/>  

## 源码下载

- [https://github.com/nateshao/nateshao-design-demo](https://github.com/nateshao/nateshao-design-demo)
- [https://gitee.com/nateshao/nateshao-design-demo](https://gitee.com/nateshao/nateshao-design-demo)

## pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <packaging>pom</packaging>
    <modules>
        <module>1-00-factory</module>
        <module>1-01-factory</module>
        <module>1-02-factory</module>
        <module>2-00-abstract-factory</module>
        <module>2-01-abstract-factory</module>
        <module>2-02-abstract-factory</module>
        <module>3-00-builder</module>
        <module>3-01-builder</module>
        <module>3-02-builder</module>
        <module>4-00-prototype</module>
        <module>4-01-prototype</module>
        <module>4-02-prototype</module>
        <module>5-00-singleton</module>
        <module>6-00-adapter-mode</module>
        <module>6-01-adapter-mode</module>
        <module>6-02-adapter-mode</module>
    </modules>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.4.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.nateshao.design</groupId>
    <artifactId>nateshao-design-demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>nateshao-design-demo</name>
    <description>Demo project for Spring Boot</description>

    <properties>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>com.nateshao.design</groupId>
            <artifactId>4-00-prototype</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>com.nateshao.design</groupId>
            <artifactId>4-00-prototype</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <scope>compile</scope>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
```

**Hello, world of design！** 你好，设计模式的世界！

## 赞助作者买个馒头吧💚

| 支付宝                                                       | 微信                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| <img width="200" height="200" src="https://nateshao.gitee.io/medias/reward/alipay.jpg"/> | <img width="200" height="200" src="https://nateshao.gitee.io/medias/reward/wechat.png"/> |



