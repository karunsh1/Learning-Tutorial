package com.spring.demo.tutorial22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class DrawingApp22 {


	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("/spring22.xml");
		context.registerShutdownHook();
		Shape22 shape22 = (Shape22) context.getBean("circle22");
		shape22.draw();
		//System.out.println(context.getMessage("greeting", null, "Default Greeting", null));

	}

}
