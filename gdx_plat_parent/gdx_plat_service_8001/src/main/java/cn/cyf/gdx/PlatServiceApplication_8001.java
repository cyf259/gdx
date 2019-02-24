package cn.cyf.gdx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cyf
 * @date 2019/2/23 14:30
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
public class PlatServiceApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication_8001.class);
    }
}

