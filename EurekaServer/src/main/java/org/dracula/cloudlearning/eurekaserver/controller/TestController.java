package org.dracula.cloudlearning.eurekaserver.controller;

import org.dracula.cloudlearning.eurekaserver.SomeConfigurationProperties;
import org.dracula.cloudlearning.eurekaserver.vo.CommonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public CommonVO<String> test(){
        CommonVO<String> rslt = new CommonVO<>();
        rslt.setCode("00000");
        rslt.setMsg("SUCCESS");
        rslt.setData("hello world");
        return rslt;
    }

    @Value("${application}")
    private String application;

    @RequestMapping(value="/testConfig", method=RequestMethod.GET)
    public String testConfig(){
        return application;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Autowired
    private SomeConfigurationProperties someConfigurationProperties;

    @GetMapping("/testConfigurationProperties")
    public SomeConfigurationProperties testConfigurationProperties(){
        return someConfigurationProperties;
    }
}
