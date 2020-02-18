package com.example.demo.po;

import javax.websocket.Session;

public class UserMessage {
	Session session;
	String pid;
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	
	
	
}
