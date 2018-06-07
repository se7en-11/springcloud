package com.saliai.eurekaconsumerribbonhystrix.controller;

import com.saliai.eurekaconsumerribbonhystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/7 14:22
 * @Modify By:
 */

@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @RequestMapping(value = "/test")
    public String test() {
        return hystrixService.consumer();
    }
}
