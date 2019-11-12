package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.models.A;

public class Launcher {
	public static void main(String[] args) {
		ApplicationContext appContext =
				new AnnotationConfigApplicationContext("com.revature.models");
		
		A a = appContext.getBean(A.class);
		System.out.println(a);
	}
}
