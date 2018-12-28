package org.dracula.cloudlearning.eurekaclient1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value="/testClient1", method=RequestMethod.GET)
    public String test(){
        logger.info("in test client1");
        errorOrNot();
        return "hello world";
    }

    private void errorOrNot() {
        int timeToWait = (int)(new Random().nextDouble() * 4);
        logger.info("将等待"+timeToWait+"s");
        try {
            Thread.sleep(timeToWait * 1000);
        } catch (InterruptedException e) {
            logger.error("", e);
        }
        logger.info("等完了，继续");
    }

}
