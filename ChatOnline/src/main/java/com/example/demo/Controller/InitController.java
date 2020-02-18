package com.example.demo.Controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.util.ApplicationData;
import com.example.demo.util.ChineseName;

@Controller
public class InitController {

	@RequestMapping("/")
	public String login(ModelMap map) {
		ChineseName name=new ChineseName();
		map.addAttribute("pid", UUID.randomUUID().toString().replace("-",""));
		map.addAttribute("sid", "555");
		map.addAttribute("name", name.randomName());
		return "page/index/logon";
	}
	
	@RequestMapping("/manage")
	public String manage(ModelMap map) {
		
		map.addAttribute("map",ApplicationData.getContentMap());
		return "page/manage";
	}
	@RequestMapping("/demo")
	public String demo(ModelMap map) {
		
		//map.addAttribute("map",ApplicationData.getContentMap());
		return "page/demo";
	}
	//@ResponseBody
	@RequestMapping("/chat")
	public String chat(ModelMap map) {
		ChineseName name=new ChineseName();
		map.addAttribute("pid", UUID.randomUUID().toString().replace("-",""));
		map.addAttribute("sid", "555");
		map.addAttribute("name", name.randomName());
		//map.addAttribute("map",ApplicationData.getContentMap());
		return "page/chat";
	}
}
