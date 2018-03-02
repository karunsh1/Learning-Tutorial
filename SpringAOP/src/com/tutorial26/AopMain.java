package com.tutorial26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tutorial26.model.Circle26;
import com.tutorial26.services.ShapeService26;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("/Spring26.xml");
		ShapeService26 shapeService = context.getBean("shapeService",ShapeService26.class);
		shapeService.getCircle().setName("Half Circle");
		System.out.println(shapeService.getCircle().getName());

	}

}
