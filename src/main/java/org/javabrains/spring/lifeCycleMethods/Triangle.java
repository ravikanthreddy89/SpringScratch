package org.javabrains.spring.lifeCycleMethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Triangle(){
		
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This method is called after setting properties");
		System.out.println("Point A : "+getPointA().getX());
		System.out.println("Point A : "+getPointA().getY());
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This method is called during destruction phase.");
		
	}
}
