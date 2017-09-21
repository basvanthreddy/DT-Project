package com.niit.com.NIITEcommerceBackEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.com.NIITEcommerceBackEnd.DAO.UserDao;
import com.niit.com.NIITEcommerceBackEnd.model.User;

public class UserTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext();
		config.scan("com.niit.com.NIITEcommerceBackEnd.*");
		config.refresh();
		
		User user=(User)config.getBean("user");
		UserDao userDao=(UserDao) config.getBean("UserDao");
		
		
		user.setUserAddress("vijaynagar");
		user.setUserEmail("basvanth12@gmail.com");
		user.setUserName("basvanth");
		user.setUserMobileNo(997254201);
		
		userDao.saveUser(user);
		userDao
		
		
		
		
		
		

	}

}
