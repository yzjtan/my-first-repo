package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);

		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("\n Pointing to the same object: " + result);
		System.out.println("\n Memory location for theCoach: "+ theCoach);
		System.out.println("\n Memory location for the alphaCoach: " + alphaCoach + "\n");
		
		context.close();

	}

}
