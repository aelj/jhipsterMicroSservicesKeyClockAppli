package com.bdf.jhipster.microservices.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.bdf.jhipster.microservices")
public class FeignConfiguration {

}
