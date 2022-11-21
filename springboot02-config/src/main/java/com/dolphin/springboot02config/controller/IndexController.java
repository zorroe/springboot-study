package com.dolphin.springboot02config.controller;

import com.dolphin.springboot02config.config.TestConfig;
import com.dolphin.springboot02config.entity.BlogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private BlogEntity blogEntity;

    @Value("${test.name}")
    private String name;
    @Value("${test.age}")
    private String age;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public BlogEntity index() {
        return blogEntity;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public TestConfig test() {
        TestConfig testConfig = new TestConfig();
        testConfig.setName(name);
        testConfig.setAge(age);
        return testConfig;
    }
}
