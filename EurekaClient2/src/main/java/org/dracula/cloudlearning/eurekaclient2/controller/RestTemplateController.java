package org.dracula.cloudlearning.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/restTemplate2to1")
    public String test(){
        return "经过Client2的RestTemplate加工："
                +restTemplate.getForEntity("http://client1/testClient1", String.class).getBody();
    }

    @Configuration
    public static class RestTemplateConfig{

        @Bean
        @LoadBalanced
        RestTemplate restTemplate() {
            return new RestTemplate();
        }
    }

}
