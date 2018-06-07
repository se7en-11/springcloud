package com.saliai.eurekaconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/7 10:59
 * @Modify By:
 */

@FeignClient(value = "eureka-client")
@Service
public interface FeignService {

    @GetMapping(value = "/hello")
    public String hello();
}
