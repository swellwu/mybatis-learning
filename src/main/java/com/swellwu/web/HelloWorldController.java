package com.swellwu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>Description:</p>
 *
 * @author xinjian.wu
 * @date 2017-07-02
 */
@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world!";
    }
}
