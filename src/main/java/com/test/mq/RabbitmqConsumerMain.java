package com.test.mq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RabbitmqConsumerMain {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("receive-rabbitMq.xml");
	}
}
