package com.example.gmall.demotest01.controller;

import com.example.gmall.demotest01.bean.UserInfo;
import com.example.gmall.demotest01.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }


    //
    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfo.setLoginName("wangwu");
        userInfo.setPasswd("12345");

        userInfoService.addUser(userInfo);
        System.out.println(userInfo.getId());

    }


  //修改
//    @RequestMapping("updById")
//    public String updById(UserInfo userInfo){
//       userInfo.setName("你好");
//       userInfo.setId("5");
//       userInfoService.updUser(userInfo);
//        return "ok";
//    }


    @RequestMapping("updByName")
    public String updByName(UserInfo userInfo){
        userInfo.setName("你好");
        userInfo.setLoginName("张琪琪");
        userInfoService.updUserByName(userInfo);
        return "ok";
    }


    //删除
    @RequestMapping("delUser")
    public String delUser(UserInfo userInfo){
        userInfoService.delUser(userInfo);

        return "ok";
    }


    @RequestMapping("delUserByName")
    public String delUserByName(UserInfo userInfo){
        userInfoService.delUser(userInfo);

        return "ok";
    }


}
