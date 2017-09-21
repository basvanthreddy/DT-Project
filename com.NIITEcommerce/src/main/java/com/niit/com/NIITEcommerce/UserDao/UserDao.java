package com.niit.com.NIITEcommerce.UserDao;

import java.util.List;

import com.niit.com.NIITEcommerce.Usermodel.User;

public interface UserDao {
	
	public  void saveUser(User user);
	
	public  void deleteUser(int id);
	
	
	public List<User> listUsers();

	
	
	

}
