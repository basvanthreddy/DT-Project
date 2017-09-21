package com.niit.com.NIITEcommerce.Categorymodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Category {

	@Id

	private int cId;
	private String cName;
	private String cdescription;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getCdescription() {
		return cdescription;
	}

	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}

	@Override
	public String toString() {
		return "Category [cId=" + cId + ", cName=" + cName + ", cdescription=" + cdescription + "]";
	}
	

}
