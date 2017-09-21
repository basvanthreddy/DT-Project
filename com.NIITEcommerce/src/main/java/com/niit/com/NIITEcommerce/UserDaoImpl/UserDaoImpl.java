
package com.niit.com.NIITEcommerce.UserDaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.com.NIITEcommerce.UserDao.UserDao;
import com.niit.com.NIITEcommerce.Usermodel.User;
@Repository("UserDao")
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	UserDaoImpl(SessionFactory sessionfactory){
		this.sessionFactory=sessionfactory;
	}
	public void saveUser(User user) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}

	public void deleteUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		User user=(User)session.get(User.class, id);
		session.delete(user);
	}
	public List<User> listUsers() {

		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User");
		List<User> list=query.list();
		return list;
	}
}
