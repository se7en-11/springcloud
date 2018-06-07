package com.saliai.eurekaconsumerribbonhystrix.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.saliai.eurekaconsumerribbonhystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/7 14:25
 * @Modify By:
 */

@Service
public class HystrixServiceImpl implements HystrixService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }

    public String fallback() {
        return "Hystrix fall back...";
    }
}
