package com.test.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

@Service
public class RabbitmqProducerTest {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("send-rabbitMq.xml");
		AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
		JSONObject json = new JSONObject();
		json.put("name", "张三");
		json.put("age", "15");
		amqpTemplate.convertAndSend("queue.ljaer.test", json);
		//amqpTemplate.convertAndSend("exchange.topic.producer","queue.zk.test", json);
		System.out.println("success");
	}
}
