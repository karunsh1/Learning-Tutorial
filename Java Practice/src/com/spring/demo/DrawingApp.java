package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("/spring.xml");
		Triangle triangleInstance = (Triangle) context.getBean("triangleID");
		triangleInstance.draw();

	}

}
