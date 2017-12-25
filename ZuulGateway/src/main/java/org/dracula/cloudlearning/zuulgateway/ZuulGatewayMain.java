package org.dracula.cloudlearning.zuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayMain {

    public static void main(String[] args){
        SpringApplication.run(ZuulGatewayMain.class, args);
    }

}
