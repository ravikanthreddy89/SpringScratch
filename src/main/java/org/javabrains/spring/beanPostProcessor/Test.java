package org.javabrains.spring.beanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String [] args){
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("XML/beanPostProcessor.xml");
		System.out.println("hello");
		
		Triangle triangle=(Triangle) beanFactory.getBean("triangle");
	}
}
