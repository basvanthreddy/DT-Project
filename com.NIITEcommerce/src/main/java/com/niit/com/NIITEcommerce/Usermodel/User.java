
package com.niit.com.NIITEcommerce.Usermodel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
@Component
@Entity
public class User {
	
	@SuppressWarnings("deprecation")
	@Size(min=3, max=30, message="size can be between 3 and 30")
	@NotEmpty(message="User name cannot be empty")
	private String username;
	private String useraddress;
	
	@Pattern(regexp=".+@.+\\.[a-z]+", message="email format abc@xyz,com")
	@NotEmpty(message="email cannot be empty")
	private String useremail;
	
	@Pattern(regexp="\\d{10}", message=" enter 10 digit phone number")
	@NotEmpty(message="phone no cannot be empty")
	private long   usermobileno;
	
	@Id
	private int    userid;
	
	private String role;
	
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
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
