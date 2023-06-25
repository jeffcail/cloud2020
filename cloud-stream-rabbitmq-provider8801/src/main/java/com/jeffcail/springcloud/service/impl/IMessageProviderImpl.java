package com.jeffcail.springcloud.service.impl;

import com.jeffcail.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName IMessageProviderImpl
 * @Description TODO
 * @Author cc
 * @Date 2023/6/24 8:34 下午
 * @Version 1.0
 */
@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("===========serial: " + serial);
        return null;
    }

}
