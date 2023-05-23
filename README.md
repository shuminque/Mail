# Mail
javamail邮件小项目
打包下来后,修改application.yaml文件的数据库配置
spring:
    security:
        user:
            name: test   # ???
            password: 123456  # ??
            roles:   # ??
                - user
                - admin
    datasource:
        url: jdbc:mysql://localhost:3306
        username: root
        password: qsm12104214! #配置为自己数据库的密码
        driver-class-name:  com.mysql.cj.jdbc.Driver
    mail:
        # 所用邮箱的smtp地址
        host: smtp.qq.com
        # 发件人的邮箱地址
        username: shuminque@qq.com
        # 授权码
        password: bawerassliehbcef
    mvc:
        static-path-pattern: /static/**
