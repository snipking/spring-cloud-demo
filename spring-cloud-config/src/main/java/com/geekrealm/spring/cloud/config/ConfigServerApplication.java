/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geekrealm.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author DerekChia <snipking@gmail.com>
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication {
    
    public static void main(String... args) {
        SpringApplication.run(ConfigServerApplication.class);
    }
}
