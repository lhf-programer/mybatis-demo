package com.example.mybatis.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatis.service.IUserService;
import com.example.mybatis.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author haifeng.lv
 * @Date 2020/1/15 9:53
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public IPage<UserInfo> test() {
        IPage<UserInfo> test = userService.test();
        return test;
    }

}
