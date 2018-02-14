package com.spring.demo.tutorial13;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javax.security.auth.Destroyable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.spring.demo.tutorial09.Point09;

import javafx.fxml.Initializable;

public class Traingle13 implements InitializingBean,DisposableBean {

	/*
	 * private Point12 pointA; private Point12 pointB; private Point12 pointC;
	 */
	private ApplicationContext context = null;

	private List<Point13> points;

	public List<Point13> getPoints() {
		return points;
	}

	public void setPoints(List<Point13> points) {
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
		for (Point13 point : points) {

			System.out.println(" Points are : (" + point.getX() + " , " + point.getY() + ")");
		}
	}

	

	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Intialilizeing  implement bean init for triangle");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Destroy desposbablethe beans");
		
	}
	public void myInit () {
		System.out.println("Intialilizeing bean init for triangle");
	}
	public void cleanUp() {
		System.out.println("Destroy the beans");
	}

}
