package org.javabrains.spring.userDefinedLifeCycleMethods;

public class Triangle {

	private Point pointA;
	
	public Triangle(){
		
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public void myInit(){
		System.out.println("This is user defined init() method. used to break spring dependency.");
	}
	
	public void myDestroy(){
		System.out.println("This is user defined destroy() method. It doesn't depend on spring.");
	}
}
