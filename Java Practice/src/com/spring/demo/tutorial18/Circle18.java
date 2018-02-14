package com.spring.demo.tutorial18;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component // to address class as a bean then no need to define in spring.xml but not for multiple 
@Service // for service layer class 
@Repository   // Data Object class
@Controller //MVC 
public class Circle18 implements Shape18 {

	private Point18 center;

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("The point is:  (" + center.getX() + " , " + center.getY() + " )");
	}

	public Point18 getCenter() {
		return center;
	}
	/*//@Required
	@Autowired
	@Qualifier("circleRelated")*/
	@Resource(name="point3")
	public void setCenter(Point18 center) {
		this.center = center;
	}
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Initilize the circcle");
	}
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy the circcle");
	}

}
