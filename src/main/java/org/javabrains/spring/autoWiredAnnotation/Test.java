package org.javabrains.spring.autoWiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String [] args){
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("XML/autoWiredAnnotation.xml");
		System.out.println("Hello.");
		
		Triangle triangle=(Triangle)beanFactory.getBean("triangle");
		
		System.out.println("Point A ");
		System.out.println(" X : "+triangle.getPointA().getX());
		System.out.println(" Y : "+triangle.getPointA().getY());
		
		System.out.println("Point B ");
		System.out.println(" X : "+triangle.getPointB().getX());
		System.out.println(" Y : "+triangle.getPointB().getY());
	}
}
