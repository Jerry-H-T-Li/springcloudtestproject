package com.lht.logon;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloudtestproject
 * @author: 0027014793
 * @create: 2020-03-01 23:25
 **/
@Configuration
@ConditionalOnProperty(prefix = "filter",name = "loginFilter",havingValue = "false")
public class FilterConfig {
    //prefix为配置文件中的前缀,
    //name为配置的名字
    //havingValue是与配置的值对比值,当两个值相同返回true,配置类生效.
    @Bean
    public FilterRegistrationBean getFilterRegistration() {
        System.out.println("##########################################test############");
        FilterRegistrationBean filterRegistration  = new FilterRegistrationBean();
        filterRegistration.addUrlPatterns("/*");
        return filterRegistration;
    }
}

