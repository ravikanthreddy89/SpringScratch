package org.javabrains.spring.userDefinedLifeCycleMethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String [] args){
		
		// You need "AbstractApplicationContext", it contains a shutdownhookup() method
		AbstractApplicationContext beanFactory=new ClassPathXmlApplicationContext("XML/userDefinedLifeCycleMethods.xml");
		beanFactory.registerShutdownHook();
		Triangle triangle =(Triangle) beanFactory.getBean("triangle");
		
		System.out.println("Point A . x : "+triangle.getPointA().getX());
		System.out.println("Point A . y : "+triangle.getPointA().getY());
	}
}
