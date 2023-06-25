package com.jeffcail.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ReceiveMessageController
 * @Description TODO
 * @Author cc
 * @Date 2023/6/25 2:57 下午
 * @Version 1.0
 */
@RestController
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void  input(Message<String> message) {
        System.out.println("消费者2号, ============ 接收到的消息: " + message.getPayload() + "\t port: " + serverPort);
    }

}
