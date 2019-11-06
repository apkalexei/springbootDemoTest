package com.stark.service;

import com.stark.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class HelloServiceTest {

    @Autowired
    private HelloService service;

    @Test
    public void testHello() {
        Assert.assertTrue(service.hello().startsWith("Hello"));
    }
}