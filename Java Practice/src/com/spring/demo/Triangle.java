package com.spring.demo;

public class Triangle {
	private String type;
	public Triangle(String type){
		this.type = type;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println("Traingle "+ getType()+"is drwan");
	}

}
