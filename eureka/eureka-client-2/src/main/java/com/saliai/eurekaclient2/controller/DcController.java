package com.saliai.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/5 17:54
 * @Modify By:
 */

@RestController
public class DcController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello, this is eureka-client2.";
    }
}
