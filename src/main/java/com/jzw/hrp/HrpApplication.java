package com.jzw.hrp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jzw.hrp.system.mapper")
public class HrpApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrpApplication.class, args);
    }
}
