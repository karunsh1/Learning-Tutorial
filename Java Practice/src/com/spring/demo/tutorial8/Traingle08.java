package com.spring.demo.tutorial8;

import com.spring.demo.tutorial8.Point08;

public class Traingle08 {
	private Point08 pointA;
	private Point08 pointB;
	private Point08 pointC;
	
	
	public Point08 getPointA() {
		return pointA;
	}


	public void setPointA(Point08 pointA) {
		this.pointA = pointA;
	}


	public Point08 getPointB() {
		return pointB;
	}


	public void setPointB(Point08 pointB) {
		this.pointB = pointB;
	}


	public Point08 getPointC() {
		return pointC;
	}


	public void setPointC(Point08 pointC) {
		this.pointC = pointC;
	}


	public void draw(){
		System.out.println("Point A = (" + getPointA().getX() + " , " + getPointA().getY()+ " )");
		System.out.println("Point B = (" + getPointB().getX() + " , " + getPointB().getY()+ " )");
		System.out.println("Point C = (" + getPointC().getX() + " , " + getPointC().getY()+ " )");
		//System.out.println("Traingle "+ getType()+" is drwan with the height of "+ getHeight());
	}

}
