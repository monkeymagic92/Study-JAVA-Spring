package com.study.test.study1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TestController {
	
	@Autowired
	private TestService service;
	
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(Model model, TestVO vo) {
		
		return "test/test";
	}
	
	
	@RequestMapping(value="/test", method = RequestMethod.POST)
	public String intTest(Model model, TestVO vo) {
		
		int result = service.test(vo);
		System.out.println("result 값 : " + result);
		return "redirect:/selTest";
	}
	
	
	// 뿌리기
	@RequestMapping(value="/selTest", method = RequestMethod.GET)
	public String selTest(Model model, TestPARAM param) {
		
		model.addAttribute("list", service.selTest());
		
		return "test/selTest";
	}

}
