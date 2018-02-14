package com.spring.demo.tutorial22;

public class Triangle22 implements Shape22 {
	
	private Point22 pointA;
	private Point22 pointB;
	private Point22 pointC;
	
	public Point22 getPointA() {
		return pointA;
	}

	public void setPointA(Point22 pointA) {
		this.pointA = pointA;
	}

	public Point22 getPointB() {
		return pointB;
	}

	public void setPointB(Point22 pointB) {
		this.pointB = pointB;
	}

	public Point22 getPointC() {
		return pointC;
	}

	public void setPointC(Point22 pointC) {
		this.pointC = pointC;
	}

	/*private String type;
	private int height;
	
	
	
	
	public int getHeight() {
		return height;
	}
	public Triangle(String type){
		this.type = type;
	}
	public Triangle(int height){
		this.height = height;
	}
	public Triangle(String type, int height){
		this.type = type;
		this.height = height;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
*/
	public void draw(){
		System.out.println("Drawing Traingle");
		System.out.println("Point A = (" + getPointA().getX() + " , " + getPointA().getY()+ " )");
		System.out.println("Point B = (" + getPointB().getX() + " , " + getPointB().getY()+ " )");
		System.out.println("Point C = (" + getPointC().getX() + " , " + getPointC().getY()+ " )");
		//System.out.println("Traingle "+ getType()+" is drwan with the height of "+ getHeight());
	}

}
