package org.javabrains.spring.beanInheritance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BeanFactory beanFactory= new ClassPathXmlApplicationContext("XML/beanInheritance.xml");
       System.out.println("Hello");
       Triangle triangle = (Triangle)beanFactory.getBean("triangle1");
       System.out.println("Point A.x : "+triangle.getPointA().getX());
       System.out.println("Point A.Y : "+triangle.getPointA().getY());
    }
}
