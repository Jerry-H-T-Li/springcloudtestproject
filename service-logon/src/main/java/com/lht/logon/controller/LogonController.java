package com.lht.logon.controller;

import com.lht.logon.entity.LogonUser;
import com.lht.logon.mapper.UserMapper;
import com.lht.logon.service.LogonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springcloudtestproject
 * @author: 0027014793
 * @create: 2020-02-23 19:41
 **/
@RestController
@Api(value = "LogonController", description = "测试UserController")
public class LogonController {
    @Autowired
    LogonService logonService;

    @PostMapping("logon")
    @ApiOperation(value = "查询个人信息接口", notes = "查询个人信息接口")
    public LogonUser logon(String userName, String password) {
        Map userMap = new HashMap();
        userMap.put("userName", userName);
        userMap.put("passowrd", password);
        LogonUser logonUser = logonService.logon(userMap);
        return logonUser;
    }

    @PutMapping("regiest")
    @ApiOperation(value = "注册用户信息", notes = "注册用户信息")
    public String regiest(LogonUser logonUser) {
        return logonService.regiest(logonUser);
    }

    @GetMapping("get")
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    public String getString(){
        return "success1";
    }

}

