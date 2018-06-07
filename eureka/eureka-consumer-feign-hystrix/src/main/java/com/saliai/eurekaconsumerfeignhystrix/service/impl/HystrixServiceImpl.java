package com.saliai.eurekaconsumerfeignhystrix.service.impl;

import com.saliai.eurekaconsumerfeignhystrix.service.HystrixService;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/7 14:47
 * @Modify By:
 */
@Service
public class HystrixServiceImpl implements HystrixService {

    @Override
    public String consumer() {
        return "Feign Hystrix fall back...";
    }
}
