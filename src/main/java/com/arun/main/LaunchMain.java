package com.arun.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.arun.beans.Student;

public class LaunchMain {

	public static void main(String[] args) 
	{
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ClassPathResource resource=new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student student1=factory.getBean("std1",Student.class);
		System.out.println(student1);
		
		Student student2=factory.getBean("std2",Student.class);
		System.out.println(student2);
		

	}

}
