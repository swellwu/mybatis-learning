package com.swellwu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Description:</p>
 *
 * @author xinjian.wu
 * @date 2017-07-02
 */
@MapperScan("com.swellwu.dao")
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
