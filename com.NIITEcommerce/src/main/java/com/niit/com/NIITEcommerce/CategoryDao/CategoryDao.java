package com.niit.com.NIITEcommerce.CategoryDao;

import java.util.List;

import com.niit.com.NIITEcommerce.Categorymodel.Category;

public interface CategoryDao {

	public void saveOrUpdate(Category category);
	public void deleteCategory(int id);
	public List<Category> listCategory();
	
	
	
	
}
