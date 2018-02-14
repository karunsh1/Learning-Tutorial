package com.spring.demo.tutorial15;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBeanProcessor15 implements BeanPostProcessor {
	

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In After initialization method. Bean Name is " + beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In Before initialization method. Bean Name is " + beanName);
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
 
}
