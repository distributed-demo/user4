package com.java4all;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath:bytetcc-supports-springcloud.xml" })
@SpringBootApplication(scanBasePackages = "com.java4all")
@MapperScan("com.java4all.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class User4Application {

	public static void main(String[] args) {
		SpringApplication.run(User4Application.class, args);
	}

}
