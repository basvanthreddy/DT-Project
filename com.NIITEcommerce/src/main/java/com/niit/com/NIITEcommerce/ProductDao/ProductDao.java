package com.niit.com.NIITEcommerce.ProductDao;

import java.util.List;

import com.niit.com.NIITEcommerce.ProductModel.Product;

public interface ProductDao {


	public void saveOrUpdate(Product product);
	public void delete(int id);
	public List<Product> listProducts();
}

