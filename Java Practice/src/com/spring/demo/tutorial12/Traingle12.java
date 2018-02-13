package com.spring.demo.tutorial12;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.spring.demo.tutorial09.Point09;

public class Traingle12 implements ApplicationContextAware, BeanNameAware {

	/*
	 * private Point12 pointA; private Point12 pointB; private Point12 pointC;
	 */
	private ApplicationContext context = null;

	private List<Point12> points;

	public List<Point12> getPoints() {
		return points;
	}

	public void setPoints(List<Point12> points) {
		this.points = points;
	}

	/*
	 * public Point12 getPointA() { return pointA; }
	 * 
	 * 
	 * public void setPointA(Point12 pointA) { this.pointA = pointA; }
	 * 
	 * 
	 * public Point12 getPointB() { return pointB; }
	 * 
	 * 
	 * public void setPointB(Point12 pointB) { this.pointB = pointB; }
	 * 
	 * 
	 * public Point12 getPointC() { return pointC; }
	 * 
	 * 
	 * public void setPointC(Point12 pointC) { this.pointC = pointC; }
	 */

	public void draw() {
		/*
		 * System.out.println("Point A = (" + getPointA().getX() + " , " +
		 * getPointA().getY()+ " )"); System.out.println("Point B = (" +
		 * getPointB().getX() + " , " + getPointB().getY()+ " )");
		 * System.out.println("Point C = (" + getPointC().getX() + " , " +
		 * getPointC().getY()+ " )");
		 */
		for (Point12 point : points) {

			System.out.println(" Points are : (" + point.getX() + " , " + point.getY() + ")");
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;

	}

	@Override
	public void setBeanName(String beanName) {

		System.out.println("Bean Name is:" + beanName);

	}

}
