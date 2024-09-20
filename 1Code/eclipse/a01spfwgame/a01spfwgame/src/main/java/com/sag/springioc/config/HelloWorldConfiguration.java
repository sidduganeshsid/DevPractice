package com.sag.springioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//eliminates the verbosity in creating the java beans
//jdk 16 released
record Person (String name, int age) {};
record Address (String street,String city) {};


//it indicates that class declares one or more bean methods
@Configuration
public class HelloWorldConfiguration {
	//here you can define spring beans
	
//	The things which are managed by spring are what are called spring beans and you can define the methods
	
	@Bean //indicates that method produces the bean which is managed by spring
	public String name() {
		return "Siddu Ganesh Musa";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person() {
		return new Person("aakashganesh",21);
	}
	
	//attributes to the annotations
	@Bean(name="sgaddress")
	public Address address() {
		return new Address("vattinagulapalli","gandipet");
	}
	@Bean
	public Address address2() {
		return new Address("vattinagulapalli","rrdist");
	}
	
	//methodCall
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age());
	}
	
	//method parameter
	@Bean
	public Person person3methodParameter(String name,int age,Address sgaddress) {
		return new Person(name,age);
	}
	
	
	
}
