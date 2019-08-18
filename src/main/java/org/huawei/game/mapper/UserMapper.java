package org.huawei.game.mapper;

import org.huawei.game.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/8/14.
 */
@Service
public interface UserMapper {
    User getUserById(Integer id);
    List<User> getAllUser();
}
