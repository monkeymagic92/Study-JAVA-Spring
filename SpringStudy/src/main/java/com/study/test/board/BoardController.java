package com.study.test.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.test.board.model.BoardPARAM;
import com.study.test.board.model.BoardVO;
import com.study.test.mail.MailSendService;


@Controller
@RequestMapping("/")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@Autowired
	private MailSendService mss;
	
	// list
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String selBoard(Model model, BoardVO vo) {
		
		model.addAttribute("view", ViewRef.LIST);
		model.addAttribute("list", service.selBoard());
		
		return ViewRef.TEMP;
	}
	
	
	// reg
	@RequestMapping(value="/reg", method = RequestMethod.GET)
	public String regBoard(Model model, BoardPARAM param) {
		System.out.println("i_board 값 : " + param.getI_board());
		
		model.addAttribute("item", service.detailBoard(param));
		model.addAttribute("view", ViewRef.REG);
		return ViewRef.TEMP;
	}
	
	// reg
	@RequestMapping(value="/reg", method = RequestMethod.POST)
	public String regBoard(Model model, BoardPARAM param,
			HttpServletRequest req) {
		
		String updResult = req.getParameter("updResult");
		
		if(updResult.equals("")) { // 등록
			int result = service.insBoard(param);
			return "redirect:/";
			
		} else { // 수정
			
			int i_board = Integer.parseInt(updResult);
			param.setI_board(i_board);
			int reuslt = service.updBoard(param);
			return "redirect:/detail?i_board="+param.getI_board(); 
		}
	}

	
	
	// detail
	@RequestMapping(value="/detail", method = RequestMethod.GET)
	public String detailBoard(Model model, BoardPARAM param) {
		
		System.out.println("i_board 값 : " + param.getI_board());
		
		model.addAttribute("item", service.detailBoard(param));
		model.addAttribute("view", ViewRef.DETAIL);
		return ViewRef.TEMP;
	}
	
	
	
	// del
	@RequestMapping(value="/del", method = RequestMethod.GET)
	public String delBoard(Model model, BoardPARAM param) {
		
		int result = service.delBoard(param);
		
		return "redirect:/";
	}
	
	// 메일 보내기
	@RequestMapping(value="/email", method = RequestMethod.POST)
	public String email(Model model, BoardPARAM param) {
		System.out.println("이메일 : " + param.getEmail());
		mss.sendAutoMailFindPw(param.getEmail());
		return "redirect:/";
	}
	
}

















