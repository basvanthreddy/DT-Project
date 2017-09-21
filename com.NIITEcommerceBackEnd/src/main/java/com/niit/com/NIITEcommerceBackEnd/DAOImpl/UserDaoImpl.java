package com.niit.com.NIITEcommerceBackEnd.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.com.NIITEcommerceBackEnd.DAO.UserDao;
import com.niit.com.NIITEcommerceBackEnd.model.User;
@Repository("UserDao")
@Transactional
public class UserDaoImpl  implements UserDao{
	
	@Autowired
	 SessionFactory sessionfactory;
	
	
	public UserDaoImpl()
	{
		
	}
	
	
	 public UserDaoImpl(SessionFactory sessionFactory)
	 {
		 this.sessionfactory=sessionFactory;
	 }
	
	
	public void saveUser(User user) {
	Session session=sessionfactory.getCurrentSession();
	session.saveOrUpdate(user);
		
	}

	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public List<User> listUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
