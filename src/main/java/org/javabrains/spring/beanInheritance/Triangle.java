package org.javabrains.spring.beanInheritance;
import java.util.Collection;

public class Triangle {

	//Variable initialized either by setter injection or Constructor injection
	private Collection<Point> point;
	private Point pointA;
	private Point pointB;
	private Point pointc;
	
	
	public Collection<Point> getPoint() {
		return point;
	}
	public void setPoint(Collection<Point> point) {
		this.point = point;
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
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointc() {
		return pointc;
	}
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}
	
	
}
