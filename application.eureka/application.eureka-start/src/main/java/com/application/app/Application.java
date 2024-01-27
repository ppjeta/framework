package com.application.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring Boot Starter
 */
@EnableEurekaServer
@SpringBootApplication(scanBasePackages = {"com.application.*"})
@MapperScan(basePackages = {"com.application.*"})
@EnableTransactionManagement
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
