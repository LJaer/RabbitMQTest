package com.test.mq;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqConsumerTest implements MessageListener {
	
	@Override
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