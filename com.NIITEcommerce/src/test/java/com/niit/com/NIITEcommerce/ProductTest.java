
		package com.niit.com.NIITEcommerce;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.com.NIITEcommerce.CategoryDao.CategoryDao;
import com.niit.com.NIITEcommerce.Categorymodel.Category;
import com.niit.com.NIITEcommerce.ProductDao.ProductDao;
import com.niit.com.NIITEcommerce.ProductModel.Product;
import com.niit.com.NIITEcommerce.SupplierDao.SupplierDao;
import com.niit.com.NIITEcommerce.Suppliermodel.Supplier;

public class ProductTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.com.NIITEcommerce");
		context.refresh();

		Product product = (Product) context.getBean("product");
		ProductDao productDao = (ProductDao) context.getBean("ProductDao");
		Category category = (Category) context.getBean("category");
		Supplier supplier=(Supplier) context.getBean("supplier");
		CategoryDao categoryDao = (CategoryDao) context.getBean("CategoryDao");
		SupplierDao supplierDao=(SupplierDao) context.getBean("SupplierDao");
		
		  product.setProductId(1); product.setProductName("Hibernate Book");
		  product.setProductPrice(1300); 
		
		  
		 //product.setCategory(category);
		 //product.setSupplier(supplier);
		   product.setCategory_id(category.getcId());
		   
		   categoryDao.saveOrUpdate(category);	
		   supplierDao.saveOrUpdate(supplier);
		   productDao.saveOrUpdate(product);
		  
		 
		 
		/*productDao.delete(0);
		productDao.delete(7);
		*/
		
		/*List<Product> list = productDao.listProducts();

		for (Product p : list) {
			System.out.println(p);

		}*/
	}

}
