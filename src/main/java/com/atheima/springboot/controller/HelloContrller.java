package com.atheima.springboot.controller;

import com.atheima.springboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @auther lizongxiao
 * @date 2019/10/16 - 17:30
 */
@Controller
public class HelloContrller {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){
        if (user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "hello world";
    }
}
