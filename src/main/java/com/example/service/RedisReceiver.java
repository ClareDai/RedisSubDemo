package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class RedisReceiver {

    public void receiveMessage(String message) {
        System.out.println("接收消息：" + message);
    }
}
