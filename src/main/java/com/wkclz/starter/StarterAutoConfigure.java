package com.wkclz.starter;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(value = {"com.wkclz.sdk.feign"})
@ComponentScan(basePackages = {
    "com.wkclz.starter",
    "com.wkclz.sdk",
    "com.wkclz.core",
})
public class StarterAutoConfigure {
}


