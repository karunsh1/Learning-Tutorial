package com.spring.demo.tutorial10;

import java.util.List;

import com.spring.demo.tutorial09.Point09;

public class Traingle10 {
	
	private Point10 pointA; 
	private Point10 pointB; 
	private Point10 pointC; 
	

	public Point10 getPointA() {
		return pointA;
	}


	public void setPointA(Point10 pointA) {
		this.pointA = pointA;
	}


	public Point10 getPointB() {
		return pointB;
	}


	public void setPointB(Point10 pointB) {
		this.pointB = pointB;
	}


	public Point10 getPointC() {
		return pointC;
	}


	public void setPointC(Point10 pointC) {
		this.pointC = pointC;
	}


	public void draw(){
		System.out.println("Point A = (" + getPointA().getX() + " , " + getPointA().getY()+ " )");
		System.out.println("Point B = (" + getPointB().getX() + " , " + getPointB().getY()+ " )");
		System.out.println("Point C = (" + getPointC().getX() + " , " + getPointC().getY()+ " )");
	}

}
