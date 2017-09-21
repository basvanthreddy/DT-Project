package com.niit.com.NIITEcommerce.ProductDaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.com.NIITEcommerce.ProductDao.ProductDao;
import com.niit.com.NIITEcommerce.ProductModel.Product;

@Repository("ProductDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionfactory;

	ProductDaoImpl(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public void saveOrUpdate(Product product) {
		Session session = sessionfactory.getCurrentSession();
		session.saveOrUpdate(product);

	}

	public void delete(int id) {
		Session session = sessionfactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, id);
		session.delete(product);

	}

	public List<Product> listProducts() {
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("From Product");
		List<Product> list = query.list();
		return list;
	}

}
