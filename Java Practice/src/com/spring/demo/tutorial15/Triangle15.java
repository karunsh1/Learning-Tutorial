package com.spring.demo.tutorial15;

public class Triangle15 {
	
	private Point15 pointA;
	private Point15 pointB;
	private Point15 pointC;
	
	public Point15 getPointA() {
		return pointA;
	}

	public void setPointA(Point15 pointA) {
		this.pointA = pointA;
	}

	public Point15 getPointB() {
		return pointB;
	}

	public void setPointB(Point15 pointB) {
		this.pointB = pointB;
	}

	public Point15 getPointC() {
		return pointC;
	}

	public void setPointC(Point15 pointC) {
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
		System.out.println("Point A = (" + getPointA().getX() + " , " + getPointA().getY()+ " )");
		System.out.println("Point B = (" + getPointB().getX() + " , " + getPointB().getY()+ " )");
		System.out.println("Point C = (" + getPointC().getX() + " , " + getPointC().getY()+ " )");
		//System.out.println("Traingle "+ getType()+" is drwan with the height of "+ getHeight());
	}

}
