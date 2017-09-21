package com.niit.com.NIITEcommerce.Usermodel;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class User {
	
	private String username;
	private String useraddress;
	private String useremail;
	private long   usermobileno;
	
	@Id
	private int    userid;
	
	
	
	public String getUsername() {
		
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public long getUsermobileno() {
		return usermobileno;
	}
	public void setUsermobileno(long usermobileno) {
		this.usermobileno = usermobileno;
	}
	public int getId() {
		return userid;
	}
	public void setId(int id) {
		this.userid = id;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", useraddress=" + useraddress + ", useremail=" + useremail
				+ ", usermobileno=" + usermobileno + ", userid=" + userid + "]";
	}
	




}
