package com.saliai.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/6 14:30
 * @Modify By:
 */

@RestController
@RefreshScope
public class ClientController {

    @Value("${info.profile}")
    private String info;

    @RequestMapping(value = "/test")
    public String test() {
        return info;
    }
}
