package com.niit.com.NIITEcommerce;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.com.NIITEcommerce.SupplierDao.SupplierDao;
import com.niit.com.NIITEcommerce.Suppliermodel.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.com.NIITEcommerce");
		context.refresh();
		Supplier supplier=(Supplier) context.getBean("supplier");
		SupplierDao supplierDao=(SupplierDao) context.getBean("SupplierDao");
		
		supplier.setSupplierid(1);
		supplier.setSupplirename("Dgroup");
		supplier.setSupplierplace("Bangalore-360040");
		
		supplier.setSupplierid(2);
		supplier.setSupplirename("@Beats");
		supplier.setSupplierplace("Delhi-570999");
		supplierDao.saveOrUpdate(supplier);
		
		supplier.setSupplierid(3);
		supplier.setSupplirename("Audi");
		supplier.setSupplierplace("kerla-69797");
		supplierDao.saveOrUpdate(supplier);
		
		supplier.setSupplierid(4);
		supplier.setSupplirename("Bmw");
		supplier.setSupplierplace("usa-0003");
		
		
		supplierDao.saveOrUpdate(supplier);
		
		//supplierDao.delete(3);

		/*List<Supplier> list=supplierDao.listSupplier();
		
		for (Supplier s : list) {
			System.out.println(s);
			
		}*/
		
	}

}
