package com.spring.demo.tutorial18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class DrawingApp18 {


	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("/spring18.xml");
		context.registerShutdownHook();
		Shape18 shape18 = (Shape18) context.getBean("circle18");
		shape18.draw();
		

	}

}
