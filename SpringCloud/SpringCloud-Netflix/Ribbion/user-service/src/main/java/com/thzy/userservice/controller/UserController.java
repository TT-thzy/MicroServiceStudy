package com.thzy.userservice.controller;

import com.thzy.userservice.pojo.CommonResult;
import com.thzy.userservice.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: MicroServiceStudy
 * @description:
 * @author: Mr.Wang
 * @create: 2024-06-06 23:21
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/create")
    public CommonResult create(@RequestBody User user) {
        return new CommonResult("操作成功", 200);
    }

    @GetMapping("/{id}")
    public CommonResult<User> getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(5565141l);
        user.setName("bo");
        user.setEmail("bo@gmail.com");
        user.setPhone("5451234421");
        LOGGER.info("根据id获取用户信息，用户名称为：{}", user.getName());
        return new CommonResult(user);
    }

    @GetMapping("/getUserByIds")
    public CommonResult<List<User>> getUserByIds(@RequestParam List<Long> ids) {
        List<User> userList = new ArrayList<>(2);

        User user1 = new User();
        user1.setId(5565141l);
        user1.setName("bo");
        user1.setEmail("bo@gmail.com");
        user1.setPhone("5451234421");

        User user2 = new User();
        user2.setId(5124144l);
        user2.setName("jerry");
        user2.setEmail("jerry@gmail.com");
        user2.setPhone("5451234421");

        userList.add(user1);
        userList.add(user2);

        LOGGER.info("根据ids获取用户信息，用户列表为：{}", userList);
        return new CommonResult<>(userList);
    }

    @GetMapping("/getByUsername")
    public CommonResult<User> getByUsername(@RequestParam String username) {
        User user = new User();
        user.setId(5565141l);
        user.setName(username);
        user.setEmail(username + "@gmail.com");
        user.setPhone("5451234421");
        return new CommonResult<>(user);
    }

    @PostMapping("/update")
    public CommonResult update(@RequestBody User user) {
        return new CommonResult("操作成功", 200);
    }

    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        return new CommonResult("操作成功", 200);
    }
}