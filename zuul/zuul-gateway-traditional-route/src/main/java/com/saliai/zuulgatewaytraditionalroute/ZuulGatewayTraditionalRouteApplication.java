package com.saliai.zuulgatewaytraditionalroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayTraditionalRouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayTraditionalRouteApplication.class, args);
	}
}
