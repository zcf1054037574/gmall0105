package com.atguigu.gmell.user.controller;

import com.atguigu.gmell.user.base.UmsMemberReceiveAddress;
import com.atguigu.gmell.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserAddress")
    public List<UmsMemberReceiveAddress> getUserAddress(){
        return userService.getUserAddressinfo();
    }


}
