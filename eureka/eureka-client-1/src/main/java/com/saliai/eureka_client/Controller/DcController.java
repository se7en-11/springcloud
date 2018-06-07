package com.saliai.eureka_client.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/5 11:11
 * @Modify By:
 */

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/services")
    public String getServices() {
        return discoveryClient.getServices().toString();
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello, this is eureka-client1.";
    }
}
