package com.chen.study;

import com.chen.study.entity.CoExample;
import com.chen.study.entity.PersonInfor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
class SpringbootDemo1ApplicationTests {
    @Value("${name}")
    String name;
    @Value("${age}")
    Integer age;

    @Autowired
    PersonInfor personInfor;

    @Autowired
    CoExample coExample;

    @Test
    void contextLoads() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(personInfor);
        System.out.println(coExample);
    }

}
