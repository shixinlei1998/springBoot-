package com.shixinlei.demo.rest;

import com.shixinlei.demo.domain.User;
import com.shixinlei.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @name: UserRest
 * @author: shixinlei
 */
@Api(value = "用户rest", tags = "用户的rest")
@RequestMapping("sxl")
@RestController
public class UserRest {

    @Resource
    private UserService userService;

    @ApiOperation(value = "查询用户列表", notes = "查询用户列表", produces = "application/json")
    @GetMapping("/user")
    public String getUser() {
        List<User> userList = userService.list();
        return "hello";
    }
}
