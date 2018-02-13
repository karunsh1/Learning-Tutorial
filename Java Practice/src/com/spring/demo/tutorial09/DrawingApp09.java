package com.spring.demo.tutorial09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class DrawingApp09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/spring09.xml");
		Traingle09 triangleInstance = (Traingle09) context.getBean("triangle-alias");
		triangleInstance.draw();
	}

}
 