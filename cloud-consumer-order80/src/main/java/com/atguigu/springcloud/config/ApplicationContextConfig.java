package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther admin
 * @Date 2020/4/9 18:16
 */
@Configuration//用@Conﬁguration注释类表明其主要目的是作为bean定义的源
public class ApplicationContextConfig {

    @Bean//用注解的方式注入，想当于spring配置文件中的<bean id ="" class="">
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
