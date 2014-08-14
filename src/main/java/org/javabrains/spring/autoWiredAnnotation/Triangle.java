package org.javabrains.spring.autoWiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle {

	private Point pointA;
	private Point pointB;
	
	public Triangle(){
		
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	
	@Autowired
	@Qualifier("triangleRelated")
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
}
