package com.jsp.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PenDriver {
	public static void main(String[] args) {
		
		// Method 1 - Creating the object using BeanFactory
		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		Pen pen = (Pen) beanFactory.getBean("myPen"); 
		// Responsible to create the Object and in return we are giving bean so we need to do 
		pen.write();
		
		
		// Method 2 - Creating the object using ApplicationContext
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
//		Pen pen = (Pen)applicationContext.getBean("myPen");
//		pen.write();
	}
}
