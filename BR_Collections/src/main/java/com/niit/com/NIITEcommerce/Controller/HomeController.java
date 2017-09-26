package com.niit.com.NIITEcommerce.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/login")
	public String getLoginPage()
	{
		System.out.println(" inside Home controller getlogin page");
		return"login";
	}
	
	@RequestMapping("/")
	public String getIndexPage()
	{
		return "index";
	}

}

