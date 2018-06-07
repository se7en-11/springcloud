package com.saliai.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/6 9:58
 * @Modify By:
 */

@RestController
public class DcController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getServices")
    public String getServices() {
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }
}
