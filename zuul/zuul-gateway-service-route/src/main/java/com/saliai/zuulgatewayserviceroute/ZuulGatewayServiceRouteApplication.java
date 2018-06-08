package com.saliai.zuulgatewayserviceroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
public class ZuulGatewayServiceRouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayServiceRouteApplication.class, args);
	}
}
