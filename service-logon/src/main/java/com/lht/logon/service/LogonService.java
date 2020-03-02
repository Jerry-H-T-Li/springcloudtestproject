package com.lht.logon.service;

import com.lht.logon.entity.LogonUser;

import java.util.Map;

/**
 * @program: springcloudtestproject
 * @author: 0027014793
 * @create: 2020-02-22 22:10
 **/
public interface LogonService {

    public LogonUser logon(Map userMap);
    public String regiest(LogonUser logonUser);
}
