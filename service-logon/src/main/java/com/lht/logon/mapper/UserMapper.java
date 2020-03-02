package com.lht.logon.mapper;

import com.lht.logon.entity.LogonUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @program: springcloudtestproject
 * @author: 0027014793
 * @create: 2020-02-22 22:16
 **/
@Mapper
public interface UserMapper {

     LogonUser queryUser(Map map);
     Integer regiest(LogonUser logonUser);

}
