package org.dracula.cloudlearning.eurekaclient1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value="/testClient1", method=RequestMethod.GET)
    public String test(){
        return "hello world";
    }

}
