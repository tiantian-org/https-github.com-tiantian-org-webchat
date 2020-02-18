package com.example.demo.util;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.example.demo.po.UserMessage;

public class ApplicationData {
	  // 保存 组id->组成员 的映射关系
    private static ConcurrentHashMap<String, List<UserMessage>> groupMemberInfoMap = new ConcurrentHashMap<>();
	private static HashMap<String ,List<String>> contentMap=new HashMap();

	public static void Init() {}

	public static ConcurrentHashMap<String, List<UserMessage>> getGroupMemberInfoMap() {
		return groupMemberInfoMap;
	}

	public static HashMap<String, List<String>> getContentMap() {
		return contentMap;
	}


}
