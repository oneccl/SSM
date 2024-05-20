package com.cc.controller;

import com.cc.pojo.User;
import com.cc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/29
 * Time: 11:40
 * Description:
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/findUser")
    public String findUser(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return "success";
    }

}
