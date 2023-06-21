package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class SessionController {

	@Autowired
	UserDao userDao; 
	
	@GetMapping("/signup")
	public String signup() {
		return "Signup";// jsp Name no extension
	}

	@PostMapping("/saveuser")
	public String saveUser(UserBean user) {
		userDao.addUser(user);
		return "Login";
	}

}
