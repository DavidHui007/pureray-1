package com.sys.hf.pureray;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xxxx.xx.**.*mapper"})
public class PurerayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurerayApplication.class, args);
	}

}
