package com.example.sq_ch11.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.sq_ch11.proxy")
public class ProjectConfig {
}
