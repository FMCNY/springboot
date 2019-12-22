package com.jinfei.springboot02config;

import com.jinfei.springboot02config.bean.Person;
import com.jinfei.springboot02config.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


/*
* SpringBoot单元测试
*
* 可以再测试期间可以进行自动注入容器
* */

@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;
    @Test
    public void testHelloService() {
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
