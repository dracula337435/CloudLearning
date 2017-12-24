package org.dracula.cloudlearning.eurekaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClient1Main {

    public static void main(String[] args){
        SpringApplication.run(EurekaClient1Main.class, args);
    }

}
