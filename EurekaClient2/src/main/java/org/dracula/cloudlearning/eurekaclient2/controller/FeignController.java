package org.dracula.cloudlearning.eurekaclient2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    private static Logger logger = LoggerFactory.getLogger(FeignController.class);

    @Autowired
    private Client1 client1;

    @RequestMapping(value="/feign2to1", method=RequestMethod.GET)
    public String test(){
        logger.info("in feitn 2 to 1");
        return "经过Client2的Feign加工："
                +client1.testClient1();
    }

    @FeignClient(name="EurekaClient1")
    public interface Client1{

        @RequestMapping(value="/testClient1", method=RequestMethod.GET)
        String testClient1();

    }

    //试验hystrix

    /**
     * hystrix默认超时时间为2秒
     * @return
     */
    @HystrixCommand(fallbackMethod = "circuitBreakerFallBack")
    @GetMapping("/testCircuitBreaker2To1")
    public String testCircuitBreaker(){
        logger.info("in testCircuitBreaker 2 to 1 ");
        return "经过有CircuitBreaker的client2，feign加工，"
                +client1.testClient1();
    }

    public String circuitBreakerFallBack(){
        return "fall back的方法，写死个返回值";
    }

}
