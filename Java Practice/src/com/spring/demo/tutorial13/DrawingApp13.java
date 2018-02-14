package com.spring.demo.tutorial13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class DrawingApp13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("/spring13.xml");
		context.registerShutdownHook();
		Traingle13 triangleInstance = (Traingle13) context.getBean("triangleID");
		triangleInstance.draw();
	}

}
 