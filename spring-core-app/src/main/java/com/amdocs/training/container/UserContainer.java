package com.amdocs.training.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amdocs.training.model.User;

public class UserContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("users.xml");
//		User user = (User) context.getBean("user");
//		System.out.println(user.getCourse());
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.amdocs.training");
		context.refresh();
		User user = context.getBean(User.class);
		//User user1 = context.getBean("user", User.class);
		//User user2 = (User)context.getBean("user");
		
		System.out.println(user);
		
		
	}

}
