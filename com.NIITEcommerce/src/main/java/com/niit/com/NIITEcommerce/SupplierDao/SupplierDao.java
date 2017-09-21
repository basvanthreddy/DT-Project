package com.niit.com.NIITEcommerce.SupplierDao;



import java.util.List;

import com.niit.com.NIITEcommerce.Suppliermodel.Supplier;

public interface SupplierDao {

	public void saveOrUpdate(Supplier supplier);
	
	public void delete(int id);
	
	public List<Supplier> listSupplier();
		
	}

