package com.example.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 用户
 * @Author: haifeng.lv
 * @Date: 2020-01-15 09:49
 */
public interface UserMapper extends BaseMapper<User> {
    IPage<User> selectLike(@Param("page") Page<User> page,@Param("user") User user);
    IPage<User> selectEqualTo(@Param("page") Page<User> page,@Param("user") User user);
}
