package com.example.demo.Service.userInfo;


import java.util.List;

import com.example.demo.dao.userInfo.model.UserInfo;

/**
 * userInfo业务接口定义
 * @author 赵家乐
 * @date 2020/02/15 16:36
 */
public interface UserInfoService {

    /**
     * 根据ID查询
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    UserInfo findById(Integer id);

    /**
     * 根据ID集查询
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    List<UserInfo> findByIds(List<Integer> ids);

    /**
     * 创建
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    Integer create(UserInfo req);

    /**
     * 根据ID删除
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    void deleteById(Integer id);

    /**
     * 根据ID集删除
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 根据ID更新
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    void updateById(UserInfo req);

    /**
     *登录
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
	UserInfo findByPhoneOrEmail(String PhoneOrEmail);
	  /**
     *注册
     * @author 赵家乐
	 * @return 
     * @date 2020/02/15 16:36
     */
	Integer regSubmit(UserInfo rsuser);

}