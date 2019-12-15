package com.atguigu.gmell.user.service;

import com.atguigu.gmell.user.base.UmsMemberReceiveAddress;
import com.atguigu.gmell.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UmsMemberReceiveAddress> getUserAddressinfo(){
        return userMapper.getUserAddressinfo();
    }

}
