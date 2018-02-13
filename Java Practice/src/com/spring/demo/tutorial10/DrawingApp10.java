package com.spring.demo.tutorial10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class DrawingApp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/spring10.xml");
		Traingle10 triangleInstance = (Traingle10) context.getBean("triangle-alias");
		triangleInstance.draw();
	}

}
 