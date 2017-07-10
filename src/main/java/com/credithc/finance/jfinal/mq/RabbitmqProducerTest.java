package com.credithc.finance.jfinal.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 *
 */
public class RabbitmqProducerTest {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("send-rabbitMq.xml");
		AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
		amqpTemplate.convertAndSend("exchange.topic.producer","queue.zk.test", "Hello World Spring amqp");
		System.out.println("success");
	}
}
