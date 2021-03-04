package com.study.test.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.test.auth.model.AuthVO;
import com.study.test.mail.MailSendService;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private AuthService service;
	
	@Autowired
	private MailSendService mss;
	
	@RequestMapping(value="/mail", method = RequestMethod.GET)
	public String insMail(Model model) {
		System.out.println("1");
		return "/mail/authmail";
	}
	
	@RequestMapping(value="/mail", method = RequestMethod.POST)
	public String insMail(Model model, AuthVO vo) {
		System.out.println("2");
		System.out.println(vo.getEmail());
		String email = vo.getEmail();
		
		mss.sendAutoMail(email);
		System.out.println("2-1");
		
		return "redirect:/auth/auth";
	}
	
	@RequestMapping(value="/auth", method = RequestMethod.GET)
	public String auth1(Model model, AuthVO vo) {
		System.out.println("3");
		return "/mail/auth";
	}
	
	@RequestMapping(value="/auth", method = RequestMethod.POST)
	public String auth2(Model model, AuthVO vo) {
		System.out.println("4");
		
		
		return "redirect:/auth/au";
	}
}
