package com.chen.study.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("com.example")
public class CoExample {

    private String name;
    private Integer age;
    private String[] address;
}
