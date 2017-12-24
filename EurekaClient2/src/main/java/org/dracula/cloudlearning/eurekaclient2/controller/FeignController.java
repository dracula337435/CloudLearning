package org.dracula.cloudlearning.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private Client1 client1;

    @RequestMapping(value="/feign2to1", method=RequestMethod.GET)
    public String test(){
        return "经过Client2的Feign加工："
                +client1.testClient1();
    }

    @FeignClient(name="client1")
    public interface Client1{

        @RequestMapping(value="/testClient1", method=RequestMethod.GET)
        String testClient1();

    }

}
