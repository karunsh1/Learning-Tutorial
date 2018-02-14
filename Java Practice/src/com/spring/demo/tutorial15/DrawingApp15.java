package com.spring.demo.tutorial15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class DrawingApp15 {


	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/spring15.xml");
		Triangle15 triangleInstance = (Triangle15) context.getBean("triangleID");
		triangleInstance.draw();

	}

}
