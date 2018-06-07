package com.saliai.eurekaconsumerribbonhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @Author: zhangzhk
 * @Description:
 * @Date: 2018/6/7 14:24
 * @Modify By:
 */
public interface HystrixService {

    public String consumer();
}
