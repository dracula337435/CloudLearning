package org.dracula.cloudlearning.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableConfigurationProperties(SomeConfigurationProperties.class)
public class EurekaServerMain {

    public static void main(String[] args){
        SpringApplication.run(EurekaServerMain.class, args);
    }

}
