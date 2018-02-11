package com.spring.demo.tutorial8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class DrawingApp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/spring08.xml");
		Traingle08 triangleInstance = (Traingle08) context.getBean("triangleID");
		triangleInstance.draw();
	}

}
