package com.github.wecomsdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class WeComSdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeComSdkApplication.class, args);
	}

}
