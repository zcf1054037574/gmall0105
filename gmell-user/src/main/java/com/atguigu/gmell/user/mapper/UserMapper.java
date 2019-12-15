package com.atguigu.gmell.user.mapper;

import com.atguigu.gmell.user.base.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UmsMemberReceiveAddress> getUserAddressinfo();
}
