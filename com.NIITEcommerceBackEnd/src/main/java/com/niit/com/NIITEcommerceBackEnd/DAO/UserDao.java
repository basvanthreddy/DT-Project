package com.niit.com.NIITEcommerceBackEnd.DAO;



import java.util.List;

import com.niit.com.NIITEcommerceBackEnd.model.User;

public interface UserDao {
	
	public void saveUser(User user);
	
	public int deleteUser(User user);
	
	public void updateUser(User user);
	
	public List<User> listUser(User user);
	
	

}
