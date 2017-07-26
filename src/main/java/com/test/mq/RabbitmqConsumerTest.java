package com.test.mq;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqConsumerTest implements MessageListener {
	
	public void onMessage(Message message) {
		System.out.println("receive message:{}"+message.getBody());
		try {
			String s = new String(message.getBody(), "UTF-8");
			System.out.println("------>MQ接收到的数据："+s);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}