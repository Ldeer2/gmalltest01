package com.example.gmall.demotest01.service.impl;

import com.example.gmall.demotest01.bean.UserInfo;
import com.example.gmall.demotest01.mapper.UserInfoMapper;
import com.example.gmall.demotest01.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

   @Autowired
  private   UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> findAll() {

        return   userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    //修改
    @Override
    public void updUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updUserByName(UserInfo userInfo) {
        // 根据name 修改 loginName
        // 第一个参数：userInfo 表示要修改的数据
        // 第二个参数：表示根据什么条件修改
        // update userInfo set loginName=? where name=?

        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",userInfo.getName());

        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

//    @Override
//    public void delUser(UserInfo userInfo) {
//        userInfoMapper.deleteByPrimaryKey(userInfo);
//    }



    @Override
    public void delUser(UserInfo userInfo) {

        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",userInfo.getName());

            userInfoMapper.deleteByExample(example);
    }
}
