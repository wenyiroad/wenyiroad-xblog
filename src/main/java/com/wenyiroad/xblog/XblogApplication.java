package com.wenyiroad.xblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"com.wenyiroad.xblog.mapper"})
@ComponentScan(value = {"com.wenyiroad.xblog"})
public class XblogApplication {


	public static void main(String[] args) {
		SpringApplication.run(XblogApplication.class, args);
	}

}
