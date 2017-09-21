package com.niit.com.NIITEcommerce.Suppliermodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Supplier implements Serializable {

	private String supplirename;
	@Id
	private int supplierid;
	private String supplierplace;
	
	
	public String getSupplirename() {
		return supplirename;
	}
	public void setSupplirename(String supplirename) {
		this.supplirename = supplirename;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getSupplierplace() {
		return supplierplace;
	}
	public void setSupplierplace(String supplierplace) {
		this.supplierplace = supplierplace;
	}
	@Override
	public String toString() {
		return "Supplier [supplirename=" + supplirename + ", supplierid=" + supplierid + ", supplierplace="
				+ supplierplace + "]";
	}
	
	
}
