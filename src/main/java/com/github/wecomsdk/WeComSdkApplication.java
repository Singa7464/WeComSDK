package com.github.wecomsdk;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ForestScan
public class WeComSdkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeComSdkApplication.class, args);
    }

}
