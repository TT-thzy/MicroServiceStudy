package com.thzy.hystrix.controller;

import com.thzy.hystrix.pojo.CommonResult;
import com.thzy.hystrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: MicroServiceStudy
 * @description:
 * @author: Mr.Wang
 * @create: 2024-06-10 15:55
 **/
@RestController
@RequestMapping("api/hystrix")
public class UserHystrixController {

    @Autowired
    private UserService userService;


    @GetMapping("/testFallback/{id}")
    public CommonResult testFallback(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/testCommand/{id}")
    public CommonResult testCommand(@PathVariable Long id) {
        return userService.getUserCommand(id);
    }

    @GetMapping("/testException/{id}")
    public CommonResult testException(@PathVariable Long id) {
        return userService.getUserException(id);
    }

}
