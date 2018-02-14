package com.spring.demo.tutorial17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class DrawingApp17 {


	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/spring17.xml");
		Shape shape = (Shape) context.getBean("circleID");
		shape.draw();
		

	}

}
