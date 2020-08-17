package com.example.gmall.demotest01.service;

import com.example.gmall.demotest01.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> findAll();

    void addUser(UserInfo userInfo);

    void updUser(UserInfo userInfo);

    void updUserByName(UserInfo userInfo);

    void delUser(UserInfo userInfo);
}
