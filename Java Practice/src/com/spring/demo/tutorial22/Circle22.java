package com.spring.demo.tutorial22;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller //MVC 
public class Circle22 implements Shape22, ApplicationEventPublisherAware {

	private Point22 center;
	private ApplicationEventPublisher publisher;
	@Resource(name = "messagesource")
	private MessageSource messageSource;   

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "No Circle", null));
		System.out.println(this.messageSource.getMessage("drwaing.point", new Object[] {center.getX(),center.getY()}, "No Circle", null));
		//System.out.println("The point is:  (" + center.getX() + " , " + center.getY() + " )");
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	public Point22 getCenter() {
		return center;
	}
	@Resource(name="point3")
	public void setCenter(Point22 center) {
		this.center = center;
	}
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Initilize the circle");
	}
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy the circle");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;

		
	}

}
