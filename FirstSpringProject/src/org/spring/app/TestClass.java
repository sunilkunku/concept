package org.spring.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		Restaruant restaruantobj=(Restaruant) Context.getBean("restaruantBean");
		restaruantobj.greetCustomer();
		
	}

}
