package com.shixinlei.demo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.shixinlei.demo.common.utils.BasePojo;
import lombok.Data;

/**
 * @name: User
 * @author: shixinlei
 */
@Data
@TableName(value = "s_user")
public class User extends BasePojo {

    private String name;
}
