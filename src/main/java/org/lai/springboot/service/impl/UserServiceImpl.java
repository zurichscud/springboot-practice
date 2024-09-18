package org.lai.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.lai.springboot.mapper.UserMapper;
import org.lai.springboot.model.User;
import org.lai.springboot.service.UserService;

public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
