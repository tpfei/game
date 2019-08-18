package org.huawei.game.service.impl;

import org.huawei.game.mapper.UserMapper;
import org.huawei.game.model.User;
import org.huawei.game.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/8/14.
 */

@Service
public class UserServiceImpl implements UserService {
//
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
