package com.caveofprogramming.tutorial.jungle.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	public static void main( String [] args ) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext( "com/caveofprogramming/tutorial/jungle/spring/beans/beans.xml");
		
		Jungle jungle = (Jungle)context.getBean("jungle");
		
		System.out.println( jungle );
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
