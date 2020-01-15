package com.example.mybatis.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatis.entity.User;
import com.example.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author haifeng.lv
 * @Date 2020/1/15 9:53
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/like")
    @ResponseBody
    public IPage<User> like() {
        IPage<User> like = userService.like();
        return like;
    }

    @RequestMapping("/equalTo")
    @ResponseBody
    public IPage<User> equalTo() {
        IPage<User> equalTo = userService.equalTo();
        return equalTo;
    }

}
