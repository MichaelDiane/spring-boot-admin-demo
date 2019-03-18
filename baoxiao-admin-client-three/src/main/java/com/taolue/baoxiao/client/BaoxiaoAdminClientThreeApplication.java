package com.taolue.baoxiao.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BaoxiaoAdminClientThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaoxiaoAdminClientThreeApplication.class, args);
	}

}

