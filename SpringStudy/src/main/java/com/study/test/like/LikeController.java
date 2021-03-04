package com.study.test.like;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.test.like.model.LikeVO;



@Controller
@RequestMapping("/like")
public class LikeController {

	@Autowired
	private LikeService service;
		
	// post
	@RequestMapping(value="/insLike", method=RequestMethod.POST) 
    private @ResponseBody String insLike(@RequestBody LikeVO vo, HttpSession hs, HttpServletRequest request){
		
		System.out.println("likeChk : " + vo.getChk());
		int result = service.insLike(vo);
			
				
		return String.valueOf(vo.getChk());
	}
	
	
		
	@RequestMapping(value="/delLike", method=RequestMethod.POST) 
    private @ResponseBody String delLike(@RequestBody LikeVO vo, HttpSession hs, HttpServletRequest request){
		
		int result = service.delLike(vo);
		
		return String.valueOf(vo.getChk());
	}
}















