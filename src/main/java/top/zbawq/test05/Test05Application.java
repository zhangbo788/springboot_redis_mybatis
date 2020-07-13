package top.zbawq.test05;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Test05Application {

    public static void main(String[] args) {
        SpringApplication.run(Test05Application.class, args);
    }

}
