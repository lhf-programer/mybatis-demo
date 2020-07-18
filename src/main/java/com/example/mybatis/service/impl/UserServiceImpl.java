package com.example.mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatis.entity.User;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.service.IUserService;
import com.example.mybatis.vo.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 用户
 * @Author: haifeng.lv
 * @Date: 2020-01-15 09:49
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public IPage<UserInfo> test() {
        Page<UserInfo> page = new Page(1, 10);
        List<OrderItem> orderItems = Arrays.asList(OrderItem.desc("id"));
        page.setOrders(orderItems);

        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.select(new String[] {"id as id", "name as username"});

        return userMapper.selectTest(page, queryWrapper);
    }

}
