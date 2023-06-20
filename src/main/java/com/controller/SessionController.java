package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	@GetMapping("/signup")
	public String signup() {
		return "Signup";// jsp Name no extension
	}

	@PostMapping("/saveuser")
	public String saveUser(UserBean user) {
		return "Login";
	}

}
