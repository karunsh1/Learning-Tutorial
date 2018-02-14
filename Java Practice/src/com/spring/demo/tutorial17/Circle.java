package com.spring.demo.tutorial17;

public class Circle implements Shape {

	private Point17 center;

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("The point is:  (" + center.getX() + " , " + center.getY() + " )");
	}

	public Point17 getCenter() {
		return center;
	}

	public void setCenter(Point17 center) {
		this.center = center;
	}

}
