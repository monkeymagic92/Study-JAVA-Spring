package com.study.test.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.test.auth.model.AuthVO;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private AuthService service;
	
	@RequestMapping(value="/mail", method = RequestMethod.GET)
	public String insMail(Model model) {
		return "/mail/authmail";
	}
	
	@RequestMapping(value="/mail", method = RequestMethod.POST)
	public String insMail(Model model, AuthVO vo) {
		
		System.out.println("vo : " + vo.getEmail());
		
		return "redirect:/auth/mail";
	}
}
