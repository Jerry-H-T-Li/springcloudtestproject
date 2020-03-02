package com.lht.logon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.lht.logon.mapper")
@EnableSwagger2
public class ServiceLogonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLogonApplication.class, args);
    }

}
