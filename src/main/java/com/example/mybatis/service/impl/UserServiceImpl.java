package com.example.mybatis.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatis.entity.User;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.service.IUserService;
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
    public IPage<User> like() {
        Page<User> page = new Page(1, 10);
        List<OrderItem> orderItems = Arrays.asList(OrderItem.desc("id"));
        page.setOrders(orderItems);

        IPage<User> users = userMapper.selectLike(page, new User("1", "zhangsan"));
        return users;
    }

    @Override
    public IPage<User> equalTo() {
        Page<User> page = new Page(1, 10);
        List<OrderItem> orderItems = Arrays.asList(OrderItem.desc("id"));
        page.setOrders(orderItems);

        IPage<User> users = userMapper.selectEqualTo(page, new User("1", "zhangsan"));
        return users;
    }
}
