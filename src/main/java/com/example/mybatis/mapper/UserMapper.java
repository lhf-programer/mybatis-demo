package com.example.mybatis.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis.entity.User;
import com.example.mybatis.vo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 用户
 * @Author: haifeng.lv
 * @Date: 2020-01-15 09:49
 */
public interface UserMapper extends BaseMapper<User> {
    IPage<UserInfo> selectTest(@Param("page") Page<UserInfo> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
