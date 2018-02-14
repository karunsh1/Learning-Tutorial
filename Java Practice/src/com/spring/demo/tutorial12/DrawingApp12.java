package com.spring.demo.tutorial12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class DrawingApp12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/spring12.xml");
		Traingle12 triangleInstance = (Traingle12) context.getBean("triangleID");
		triangleInstance.draw();
	}

}
 