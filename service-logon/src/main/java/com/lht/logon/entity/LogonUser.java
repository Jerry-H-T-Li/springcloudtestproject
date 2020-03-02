package com.lht.logon.entity;

/**
 * @program: springcloudtestproject
 * @author: 0027014793
 * @create: 2020-02-22 22:11
 **/
public class LogonUser {
    private String userName;
    private String password;
    private String userEmail;
    private String userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
