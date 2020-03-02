package com.lht.logon;

import com.lht.logon.entity.LogonUser;
import com.lht.logon.service.LogonService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ServiceLogonApplication.class})
@Transactional
@Slf4j
// 指定启动类
public class ServiceLogonApplicationTests {
    @Autowired
    LogonService logonService;

    @Test
    public void logonTest() {
        Map userMap = new HashMap();
        userMap.put("userName", "123");
        userMap.put("passowrd", "123");
        LogonUser logonUser = logonService.logon(userMap);

        Assert.assertNotNull(logonUser);
    }

    @Test
    public void regiestTest() {
        LogonUser logonUser = new LogonUser();
        logonUser.setPassword("123456");
        logonUser.setUserAge("12");
        logonUser.setUserEmail("12345");
        logonUser.setUserName("12345");

        Assert.assertNotNull(logonService.regiest(logonUser));
    }

}
