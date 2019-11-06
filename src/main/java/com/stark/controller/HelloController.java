package com.stark.controller;

import com.stark.service.HelloService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @RequestMapping("")
    //@ApiOperation(value = "hello", notes = "c测试接口")
    //@ApiImplicitParam(name = "string", value = "接收参数", required = false, dataType = "String")
    private String hello(@RequestParam(defaultValue = "test") String string) {
        return service.hello();
    }
}
