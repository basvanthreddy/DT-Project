package com.niit.com.NIITEcommerce.SupplierDaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.com.NIITEcommerce.SupplierDao.SupplierDao;
import com.niit.com.NIITEcommerce.Suppliermodel.Supplier;

@Repository("SupplierDao")
@Transactional
public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	SessionFactory sessionfactory;
	
	SupplierDaoImpl(SessionFactory sessionfactory){
		this.sessionfactory=sessionfactory;
	}

	public void saveOrUpdate(Supplier supplier) {
		
		Session session=sessionfactory.getCurrentSession();
		session.saveOrUpdate(supplier);
		
		
	}

	public void delete(int id) {
		Session session=sessionfactory.getCurrentSession();
		Supplier supplier=(Supplier) session.get(Supplier.class, id);
		session.delete(supplier);
		
	}

	public List<Supplier> listSupplier() {
		Session session=sessionfactory.getCurrentSession();
		Query query= session.createQuery("From Supplier");
		List<Supplier> list=query.list();
		return list;
	}
	
}
