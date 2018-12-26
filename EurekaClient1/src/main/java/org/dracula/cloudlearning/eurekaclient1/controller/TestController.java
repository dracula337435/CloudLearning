package org.dracula.cloudlearning.eurekaclient1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value="/testClient1", method=RequestMethod.GET)
    public String test(){
        logger.info("in test client1");
        return "hello world";
    }

}
