package com.shixinlei.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shixinlei.demo.domain.User;
import com.shixinlei.demo.mapper.UserMapper;
import com.shixinlei.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @name: UserServiceImpl
 * @author: shixinlei
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
