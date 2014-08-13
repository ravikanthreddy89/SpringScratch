package org.javabrains.spring.beanInheritance;

public class Point {

	// Variables initialized using setter-injection
	private int x;
	private int y;
	

	//No-args constructor must.
	public Point(){
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}