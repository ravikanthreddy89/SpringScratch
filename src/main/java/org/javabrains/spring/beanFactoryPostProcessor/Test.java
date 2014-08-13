package org.javabrains.spring.beanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String [] args){
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("XML/beanFactoryPostProcessor.xml");
		Triangle triangle=(Triangle)beanFactory.getBean("triangle");
		
		System.out.println("Point A");
		System.out.println("X : "+triangle.getPointA().getX());
		System.out.println("Y : "+triangle.getPointA().getX());
		
		System.out.println("Point B ");
		System.out.println("X : "+triangle.getPointB().getX());
		System.out.println("Y : "+triangle.getPointB().getY());
	}
}
