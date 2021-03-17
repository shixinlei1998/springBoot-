package com.shixinlei.demo.common.utils;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.Date;

/**
 * @name: BasePojo
 * @author: shixinlei
 */
@Data
public class BasePojo {

    @TableId
    private Long id;

    private Date createTime = new Date();

    private Date updateTime = new Date();

    @TableLogic
    private Boolean deleted = false;
}
