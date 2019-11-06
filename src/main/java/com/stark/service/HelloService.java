package com.stark.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * To test api doc
 *
 * @author StarkTan
 * @since 1.0
 */
@Service
public class HelloService {
    /**
     * test javadoc api
     *
     * @return test string
     * @since 1.0
     */
    public String hello() {
        return "Hello ";
    }

    /**
     * test javadoc api
     *
     * @return test string
     * @since 1.0
     */
    public String noCover() {
        return "no cover";
    }
}
