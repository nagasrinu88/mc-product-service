/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ng.mc.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nagasrinivas
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductsApplication {

    @Value("${app.name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }

    @RestController
    @RequestMapping("/")
    public class RootController {

        @RequestMapping("/")
        public String index() {
            return "Hello! app name is:" + name;
        }
    }

}
