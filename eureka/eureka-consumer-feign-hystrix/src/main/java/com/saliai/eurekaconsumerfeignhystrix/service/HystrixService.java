package com.saliai.eurekaconsumerfeignhystrix.service;

import com.saliai.eurekaconsumerfeignhystrix.service.impl.HystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/7 14:42
 * @Modify By:
 */

@FeignClient(value = "eureka-client", fallback = HystrixServiceImpl.class)
public interface HystrixService {

    @GetMapping(value = "/hello")
    public String consumer();
}
