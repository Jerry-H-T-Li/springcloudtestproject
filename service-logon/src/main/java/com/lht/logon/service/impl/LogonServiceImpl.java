package com.lht.logon.service.impl;

import com.lht.logon.entity.LogonUser;
import com.lht.logon.mapper.UserMapper;
import com.lht.logon.service.LogonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @program: springcloudtestproject
 * @author: 0027014793
 * @create: 2020-02-22 22:13
 **/
@Service
@Transactional
public class LogonServiceImpl implements LogonService {
    @Resource
    UserMapper userMapper;
    @Override
    public LogonUser logon(Map userMap) {
       LogonUser logonUser= userMapper.queryUser(userMap);

       
        return logonUser;
    }

    @Override
    public String regiest(LogonUser logonUser) {

        return String.valueOf(userMapper.regiest(logonUser));

    }

}
