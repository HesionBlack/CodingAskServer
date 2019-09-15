package cn.hesion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.hesion.dao")
public class CodingaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodingaskApplication.class, args);
    }

}
