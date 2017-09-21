package com.niit.com.NIITEcommerce;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.com.NIITEcommerce.UserDao.UserDao;
import com.niit.com.NIITEcommerce.Usermodel.User;

public class UserTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.com.NIITEcommerce");
		context.refresh();
		User user=(User) context.getBean("user");
		UserDao userDao=(UserDao) context.getBean("UserDao");
		
		//userDao.deleteUser(1);
		user.setId(2);
		user.setUseraddress("jay");
		user.setUseremail("sunny12@yahoo.com");
		user.setUsermobileno(900886);
		user.setUsername("Reddy");
		//userDao.saveUser(user);
		
		
		List<User> list=userDao.listUsers();
		
		
		for (User u : list) {
			System.out.println(u);
		}
		
		
	}

}
