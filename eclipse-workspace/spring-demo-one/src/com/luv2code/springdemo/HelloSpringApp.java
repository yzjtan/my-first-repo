package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach agileCoach = context.getBean("agileCoach",Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(agileCoach.getDailyWorkout());
		System.out.println(agileCoach.getDailyFortune());
		
		
		//close the context
		context.close();
		
	}

}
