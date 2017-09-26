package com.niit.com.NIITEcommerce;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.com.NIITEcommerce.CategoryDao.CategoryDao;
import com.niit.com.NIITEcommerce.Categorymodel.Category;

public class CategoryTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.com.NIITEcommerce");
		context.refresh();
		Category category = (Category) context.getBean("category");
		CategoryDao categoryDao = (CategoryDao) context.getBean("CategoryDao");

		
		category.setcId(3);
		category.setcName("Novelkk");
		category.setCdescription("Belongs to chetan bhagat");
		
		categoryDao.saveOrUpdate(category);
		
		//categoryDao.deleteCategory(5);

	}

}
