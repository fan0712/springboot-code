package cn.ys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ys.mapper")
public class Quickstart8Application {

    public static void main(String[] args) {
        SpringApplication.run(Quickstart8Application.class, args);
    }

}
