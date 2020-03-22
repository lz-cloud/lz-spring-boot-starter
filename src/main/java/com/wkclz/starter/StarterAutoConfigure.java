package com.wkclz.starter;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.wkclz.starter",
    "com.wkclz.core",
})
public class StarterAutoConfigure {
}


