package com.newland.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.newland")
public class ServiceCmsApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(ServiceCmsApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
