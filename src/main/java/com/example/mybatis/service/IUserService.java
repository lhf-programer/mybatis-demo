package com.example.mybatis.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatis.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatis.vo.UserInfo;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 用户
 * @Author: haifeng.lv
 * @Date: 2020-01-15 09:49
 */
public interface IUserService extends IService<User> {
    IPage<UserInfo> test();
}
