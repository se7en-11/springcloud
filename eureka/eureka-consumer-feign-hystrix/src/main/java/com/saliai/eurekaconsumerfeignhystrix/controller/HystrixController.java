package com.saliai.eurekaconsumerfeignhystrix.controller;

import com.saliai.eurekaconsumerfeignhystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/7 14:41
 * @Modify By:
 */

@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping(value = "/test")
    public String test() {
        return hystrixService.consumer();
    }

}
