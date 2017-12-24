package org.dracula.cloudlearning.eurekaserver.controller;

import org.dracula.cloudlearning.eurekaserver.vo.CommonVO;
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

}
