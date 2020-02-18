package com.example.demo.Controller;

import org.springframework.stereotype.Component;

import com.example.demo.po.UserMessage;
import com.example.demo.util.ApplicationData;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


@Component
@ServerEndpoint("/groupChat/{sid}/{username}/{pid}")
public class GroupChatController {

  

    // 收到消息调用的方法，群成员发送消息
    @OnMessage
    public void onMessage(@PathParam("sid") String sid,
                          @PathParam("username") String username,  @PathParam("pid") String pid, String message) {
    	 String text = username + ": " + message;
    	 
        List<UserMessage> sessionList = ApplicationData.getGroupMemberInfoMap().get(sid);
        ApplicationData.getContentMap().get(sid).add(text);
        
        // 先一个群组内的成员发送消息
       for(UserMessage item :sessionList) {
        
            try {
	            	if(!pid.equals(item.getPid())) {
	            		item.getSession().getBasicRemote().sendText(message);
	            	}
            	} catch (IOException e) {
                e.printStackTrace();
            }
       }
    }

    // 建立连接调用的方法，群成员加入
    @OnOpen
    public void onOpen(Session session, @PathParam("sid") String sid, @PathParam("pid") String pid) {
    	UserMessage um=new UserMessage();
        List<UserMessage> sessionList =  ApplicationData.getGroupMemberInfoMap().get(sid);
        if (sessionList == null) {
            sessionList = new ArrayList<>();
            ApplicationData.getGroupMemberInfoMap().put(sid,sessionList);
            ApplicationData.getContentMap().put(sid, new ArrayList());
        }
        um.setSession(session);
        um.setPid(pid);
        sessionList.add(um);
        System.out.println("Connection connected");
        System.out.println("sid: {}, sessionList size: {}" + sid+","+sessionList.size());
      /*  log.info("Connection connected");
        log.info("sid: {}, sessionList size: {}", sid, sessionList.size());*/
    }

    // 关闭连接调用的方法，群成员退出
    @OnClose
    public void onClose(Session session, @PathParam("sid") String sid) {
        List<UserMessage> sessionList =  ApplicationData.getGroupMemberInfoMap().get(sid);
        UserMessage uminfo=new UserMessage();
        for(UserMessage um : sessionList) {
        	if(um.getSession().equals(session)) {
        		uminfo=um;
        	}
        }

        sessionList.remove(uminfo);

        System.out.println("Connection closed");
        System.out.println("sid: {}, sessionList size: {}" + sid+ ","+sessionList.size());
      /*  log.info("Connection closed");
        log.info("sid: {}, sessionList size: {}", sid, sessionList.size());*/
    }

    // 传输消息错误调用的方法
    @OnError
    public void OnError(Throwable error) {
    	 System.out.println("Connection error");
       /* log.info("Connection error");*/
    }
}
