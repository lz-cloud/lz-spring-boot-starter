package com.wkclz.lz;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(value = {"com.wkclz.sdk.feign"})
@ComponentScan(basePackages = {
    "com.wkclz.lz",
    "com.wkclz.sdk",
    "com.wkclz.core",
})
public class StarterAutoConfigure {
}


