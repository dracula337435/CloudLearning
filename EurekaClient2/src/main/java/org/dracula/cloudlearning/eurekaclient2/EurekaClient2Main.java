package org.dracula.cloudlearning.eurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaClient2Main {

    public static void main(String[] args){
        SpringApplication.run(EurekaClient2Main.class, args);
    }

}
