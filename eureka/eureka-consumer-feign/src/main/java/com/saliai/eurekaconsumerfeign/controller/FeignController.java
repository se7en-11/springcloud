package com.saliai.eurekaconsumerfeign.controller;

import com.saliai.eurekaconsumerfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/7 10:59
 * @Modify By:
 */

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/test")
    public String test() {
        return feignService.hello();
    }
}
