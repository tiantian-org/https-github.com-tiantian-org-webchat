package com.example.demo.Service.userInfo.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.Service.userInfo.UserInfoService;
import com.example.demo.dao.mappers.impl.UserInfoMapper;
import com.example.demo.dao.userInfo.model.UserInfo;
import com.example.demo.dao.userInfo.model.UserInfoExample;

/**
 * 业务实现
 * @author 赵家乐
 * @date 2020/02/15 16:36
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo findById(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> findByIds(List<Integer> ids) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUIdIn(ids);
        return userInfoMapper.selectByExample(userInfoExample);
    }

    @Override
    public Integer create(UserInfo req) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(req, userInfo);
        userInfoMapper.insertSelective(userInfo);
        return userInfo.getUId();
    }

    @Override
    public void deleteById(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(List<Integer> ids) {
        if(CollectionUtils.isEmpty(ids))
            return;
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUIdIn(ids);
        userInfoMapper.deleteByExample(userInfoExample);
    }

    @Override
    public void updateById(UserInfo req) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(req, userInfo);
        int result = userInfoMapper.updateByPrimaryKeySelective(userInfo);
        if(result == 0)
            throw new RuntimeException("更新失败，更新结果数为0");
    }
    
    public UserInfo findByPhoneOrEmail(String PhoneOrEmail) {
    	 return userInfoMapper.selectByloginMessage(PhoneOrEmail);
    }

	@Override
	public Integer regSubmit(UserInfo rsuser) {
		userInfoMapper.insertSelective(rsuser);
		return rsuser.getUId();
	}
}