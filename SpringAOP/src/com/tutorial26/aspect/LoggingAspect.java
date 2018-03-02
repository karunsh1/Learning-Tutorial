package com.tutorial26.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.tutorial26.model.Circle26;

@Aspect
public class LoggingAspect {

	// Annotaion @before /@after to call message (*) {any argument --(..) more
	// argument

	// @Before("execution(* getName())") // only method is being adviced any class
	// has same method will be executed
	/*
	 * @Before("execution(public String com.tutorial26.model.Circle26.getName())")
	 * // for specific class public void loggingAdvice() {
	 * System.out.println("Advice run.get Method called"); }
	 * 
	 * @Before("allGetter() && allCircleMethods()") public void secondAdvice() {
	 * System.out.println("Second Advice....");
	 * 
	 * 
	 * }
	 */
	//@Before("allCircleMethods()")
	public void secondAdvice(JoinPoint jointPoint) {
		
		/*System.out.println("Advice run.get Method called");
		System.out.println(jointPoint.toString());
		Circle26 circleJoinPoint = (Circle26) jointPoint.getTarget();
		//System.out.println(circleJoinPoint.getName() + " --- "+ name);
*/		
	}

	@Pointcut("execution(* getName())")
	public void allGetter() {

	}

	// @Pointcut("execution(* * com.tutorial26.model.Circle26.*(..))")
	/*@Pointcut("within(com.tutorial26.model.Circle26)")
	public void allCircleMethods() {
	}*/

	@Before("args(name)") // args take class name or interface
	public void AllClaasorInterface(String name) {
		System.out.println("Advice run.get Method called  "+ name);
	}
	
	@Around("allGetter()") // args take class name or interface
	public Object arroundAdvice(ProceedingJoinPoint pJoinPoint) {
		Object returbObject = null;
		try {
			System.out.println("Before proceeding ...");
			returbObject = pJoinPoint.proceed();
			System.out.println("After proceeding ...");
		} catch (Throwable e) {
			System.out.println("Exception "+ e);
		}
		return returbObject;
	}


}
