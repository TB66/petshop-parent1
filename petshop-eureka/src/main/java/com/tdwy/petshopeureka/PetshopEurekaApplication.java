package com.tdwy.petshopeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableEurekaServer
@SpringBootApplication
public class PetshopEurekaApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(PetshopEurekaApplication.class, args);
    }
    /**
     * 	定义 RestTemplate  Bean
     */
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
