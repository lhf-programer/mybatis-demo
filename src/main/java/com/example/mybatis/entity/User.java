package com.example.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: 用户
 * @Author: haifeng.lv
 * @Date: 2020-01-15 09:49
 */
@Data
@TableName("user")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User {
    
	/**id*/
	@TableId(type = IdType.UUID)
	private String id;
	/**name*/
	private String name;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public User() {

	}
}
