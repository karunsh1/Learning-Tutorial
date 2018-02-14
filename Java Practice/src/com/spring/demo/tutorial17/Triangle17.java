package com.spring.demo.tutorial17;

public class Triangle17 implements Shape {
	
	private Point17 pointA;
	private Point17 pointB;
	private Point17 pointC;
	
	public Point17 getPointA() {
		return pointA;
	}

	public void setPointA(Point17 pointA) {
		this.pointA = pointA;
	}

	public Point17 getPointB() {
		return pointB;
	}

	public void setPointB(Point17 pointB) {
		this.pointB = pointB;
	}

	public Point17 getPointC() {
		return pointC;
	}

	public void setPointC(Point17 pointC) {
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
