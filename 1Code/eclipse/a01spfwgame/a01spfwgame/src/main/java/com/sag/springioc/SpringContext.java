package com.sag.springioc;


import java.util.Arrays;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sag.springioc.config.HelloWorldConfiguration;

public class SpringContext {
	
	public static void main(String[] args) {
		
		//1. launch a spring context
		var context =
		new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2. configure the things that spring container has to manage - @Configuration
		
		//3.retrieving the beans managed by spring
		System.out.println(
		context.getBean("name"));
		
		System.out.println(
				context.getBean("person"));
//		System.out.println(
//				context.getBean(Address.class));
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
