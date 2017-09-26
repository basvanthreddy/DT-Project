package com.niit.com.NIITEcommerce.CategoryDaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.com.NIITEcommerce.CategoryDao.CategoryDao;
import com.niit.com.NIITEcommerce.Categorymodel.Category;

public class CategoryDaoImpl implements CategoryDao{

	@Autowired
	SessionFactory sessionfactory;
	
	public CategoryDaoImpl(SessionFactory sessionfactory){
		this.sessionfactory=sessionfactory;
	}
	
	public CategoryDaoImpl()
	{
		
	}
	public void saveOrUpdate(Category category) {
		Session session=sessionfactory.getCurrentSession();
		session.saveOrUpdate(category);
		
	}

	public void deleteCategory(int id) {
		Session session=sessionfactory.getCurrentSession();
		Category category=(Category) session.get(Category.class,id);
		session.delete(category);
		
	}

	public List<Category> listCategory() {
		Session session=sessionfactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category> list=query.list();
		return list;
	}

	
}
