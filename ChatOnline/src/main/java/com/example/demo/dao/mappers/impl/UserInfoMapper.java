package com.example.demo.dao.mappers.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.dao.userInfo.model.UserInfo;
import com.example.demo.dao.userInfo.model.UserInfoExample;

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

	UserInfo selectByloginMessage(String loginMessage);
}