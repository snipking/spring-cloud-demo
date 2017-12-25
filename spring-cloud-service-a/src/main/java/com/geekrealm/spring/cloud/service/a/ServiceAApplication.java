/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekrealm.spring.cloud.service.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DerekChia <snipking@gmail.com>
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class ServiceAApplication {
    public static void main(String... args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }
}
