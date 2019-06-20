package com.wenyiroad.xblog.service;

import com.wenyiroad.xblog.common.response.CommonReturnType;
import com.wenyiroad.xblog.mapper.TbUserMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private TbUserMapper userMapper;

    public CommonReturnType findAll(){
        return  CommonReturnType.success(userMapper.selectByExample(null));
    }


}
