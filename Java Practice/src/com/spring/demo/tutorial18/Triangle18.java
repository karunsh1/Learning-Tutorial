package com.spring.demo.tutorial18;

public class Triangle18 implements Shape18 {
	
	private Point18 pointA;
	private Point18 pointB;
	private Point18 pointC;
	
	public Point18 getPointA() {
		return pointA;
	}

	public void setPointA(Point18 pointA) {
		this.pointA = pointA;
	}

	public Point18 getPointB() {
		return pointB;
	}

	public void setPointB(Point18 pointB) {
		this.pointB = pointB;
	}

	public Point18 getPointC() {
		return pointC;
	}

	public void setPointC(Point18 pointC) {
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
