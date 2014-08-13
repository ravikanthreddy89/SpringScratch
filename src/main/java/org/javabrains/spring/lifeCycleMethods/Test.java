package org.javabrains.spring.lifeCycleMethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String [] args){
		
		AbstractApplicationContext beanFactory= new ClassPathXmlApplicationContext("XML/lifeCycleMethods.xml");
		beanFactory.registerShutdownHook();
		System.out.println("hello");
	}
}
