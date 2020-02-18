package com.example.demo.Controller;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

@Component
@ServerEndpoint("/websocket")
public class WebSocketServerController {

    // 收到消息调用的方法
    @OnMessage
    public void onMessage(String message) {
        System.out.println("收到的消息为 " + message);
    }

    // 建立连接调用的方法
    @OnOpen
    public void onOpen() {
        System.out.println("Client connected");
    }

    // 关闭连接调用的方法
    @OnClose
    public void onClose() {
        System.out.println("Connection closed");
    }

    // 传输消息错误调用的方法
    @OnError
    public void OnError(Throwable error) {
        System.out.println("Connection error");
    }
}