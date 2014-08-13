package org.javabrains.spring.innerBeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String [] args){
		BeanFactory beanFactory=new  ClassPathXmlApplicationContext("XML/innerBean.xml");
		Triangle triangle=(Triangle) beanFactory.getBean("triangle");
		
		//Now print the "Point" object initialized using inner bean definition
		System.out.println("Point  A's co-ordinates");
		System.out.println("X : "+triangle.getPointA().getX());
		System.out.println("Y : "+triangle.getPointA().getY());
	}
}
