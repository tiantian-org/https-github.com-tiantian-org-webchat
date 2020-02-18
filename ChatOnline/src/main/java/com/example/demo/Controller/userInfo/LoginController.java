package com.example.demo.Controller.userInfo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Service.userInfo.UserInfoService;
import com.example.demo.core.model.R;
import com.example.demo.dao.userInfo.model.UserInfo;
import com.example.demo.util.ChineseName;

@Controller
@RequestMapping("/user")
public class LoginController {
	@Autowired
	private UserInfoService userInfoService;
	
	 /**
     *	登录方法
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    
    @RequestMapping(value="UserLogin",method=RequestMethod.POST)
	public String getUsers(@ModelAttribute UserInfo user,Model model){
		String view="page/index/lose";
	//	System.out.println("登录成功"+user.getUEmail()+"-"+user.getUPassWord());
		UserInfo rsuser=userInfoService.findByPhoneOrEmail(user.getUEmail());
			if(rsuser !=null && !rsuser.getUId().equals("")) {
				if(rsuser.getUPassWord()!=null && rsuser.getUPassWord().equals(user.getUPassWord())) {
						view="success";
				}
			}
		return view;
	}
    
    @RequestMapping(value="/register",method=RequestMethod.GET)  
	public String register() {
		
		 
		return "page/index/register";
	 }
    @ResponseBody
	 @RequestMapping(value="/regSumit",method=RequestMethod.POST)
	 public R regSumit(HttpServletRequest request,Model model) {
    	ChineseName name=new ChineseName();
		 System.out.println( request.getParameter("username"));
		 System.out.println( request.getParameter("password"));
		 System.out.println( request.getParameter("passwords"));
		 System.out.println( request.getParameter("email"));
		 System.out.println( request.getParameter("remember"));
		 UserInfo rsuser=new UserInfo();
		 rsuser.setUEmail(request.getParameter("email"));
		 rsuser.setULoginID(request.getParameter("username"));
		 rsuser.setUPassWord(request.getParameter("password"));
		 rsuser.setUNickName(name.randomName());
		 rsuser.setUNationID(110000);
		 rsuser.setUUserState("1");
		 userInfoService.regSubmit(rsuser);
		 return  R.success();
	 }
    
    @RequestMapping(value="/regSuccess")
    public String regSuccess() {
    	
    	return "page/index/success";
    }
}
