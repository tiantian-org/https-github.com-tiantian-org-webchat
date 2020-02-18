package com.example.demo.Controller.userInfo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.BaseController;
import com.example.demo.Service.userInfo.UserInfoService;
import com.example.demo.core.model.R;
import com.example.demo.dao.userInfo.model.UserInfo;
import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author 赵家乐
 * @date 2020/02/15 16:36
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController extends BaseController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 根据ID查询
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    @GetMapping("/{id}")
    public R<UserInfo> findById(@PathVariable Integer id) {
        return R.data(userInfoService.findById(id));
    }

    /**
     * 根据ID集查询
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    @GetMapping("/batch/{ids}")
    public R<List<UserInfo>> findByIds(@PathVariable String ids) {
        if(StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<Integer> idList = new ArrayList<>();
            for (String id: idArray) {
                idList.add(Integer.valueOf(id.trim()));
            }
            return R.data(userInfoService.findByIds(idList));
        }
        return R.success();
    }
    /**
     * 创建
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    @PostMapping("/create")
    public R create(UserInfo req) {
        return R.data(userInfoService.create(req));
    }

    /**
     * 根据ID删除
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    @GetMapping("/delete/{id}")
    public R deleteById(@PathVariable Integer id) {
        userInfoService.deleteById(id);
        return R.success();
    }

    /**
     * 根据ID集删除
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    @GetMapping("/delete/batch/{ids}")
    public R deleteByIds(@PathVariable String ids) {
        if(StringUtils.isNotBlank(ids)) {
            String[] idArray = ids.split(",");
            List<Integer> idList = new ArrayList<>();
            for (String id: idArray) {
              idList.add(Integer.valueOf(id.trim()));
            }
            userInfoService.deleteByIds(idList);
        }
        return R.success();
    }
    /**
     * 根据ID更新
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    @PostMapping("/update")
    public R updateById(UserInfo req) {
        userInfoService.updateById(req);
        return R.success();
    }
   
}