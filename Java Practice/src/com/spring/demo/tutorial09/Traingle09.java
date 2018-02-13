package com.spring.demo.tutorial09;

import java.util.List;

import com.spring.demo.tutorial09.Point09;

public class Traingle09 {
	
	private List<Point09> points;


	public List<Point09> getPoints() {
		return points;
	}

	public void setPoints(List<Point09> points) {
		this.points = points;
	}


	public void draw(){
		for(Point09 point : points) {
			
			System.out.println(" Points are : ("+ point.getX() +" , " + point.getY() + ")" );
		}
	}

}
