package org.java8.chap01;

public class Apple {
	
	private int weight = 0;
	private String color = "";
	
	public int getWeight() {
		return weight;
	}
	public Apple(int weight, String color) {
		this.color = color;
		this.weight = weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	
	@Override
	public String toString() {
		return "Apple : {weight=" + weight + ", color=" + color +"}" ;
	}
	
	
	
	
	

}
