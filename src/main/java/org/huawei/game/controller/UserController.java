package org.huawei.game.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.huawei.game.model.User;
import org.huawei.game.service.UserService;
import org.huawei.game.utils.RedisUtil;
import org.huawei.game.utils.ResponseCode;
import org.huawei.game.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/8/13.
 */

@Api(tags="用户Controller")
@RestController
public class UserController {

    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private UserService adminServiceImpl;

    @ApiOperation(value = "测试",notes="note注意事项")
    @RequestMapping(value ="/Hi", method = RequestMethod.GET)
    public String Hi() {

        return  "hello";
    }

//    @ApiImplicitParams({
//            @ApiImplicitParam(name="id",value="用户id",required=true,paramType="Integer"),
//    })
    @ApiOperation(value = "获取用户数据",notes="根据用户id获取用户的信息")
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.POST)
    public ResponseResult<User> getUser(@PathVariable("id") Integer id) {
        return ResponseResult.build(ResponseCode.SUCCESS,"获取成功",adminServiceImpl.getUserById(id));
    }

    @ApiOperation(value = "获取数据",notes="获取所有用户数据")
    @RequestMapping(value = "/getAllUser",method = RequestMethod.POST)
    public ResponseResult<List<User>> getAllUser() {
        redisUtil.set("name","value");
        redisUtil.set("name1","redis");
        redisUtil.lSet("user",adminServiceImpl.getAllUser());
        System.out.println(redisUtil.get("name") + " " +redisUtil.get("name1"));
        System.out.println(redisUtil.lGet("user",0,-1));

        return ResponseResult.build(ResponseCode.SUCCESS,"获取成功",adminServiceImpl.getAllUser());
    }
}
