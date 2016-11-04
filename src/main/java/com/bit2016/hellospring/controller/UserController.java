package com.bit2016.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// Request mapping(type + method)
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/joinform")	//하나만있을땐 value가 숨겨져있당
	public String joinForm(){
		return "/WEB-INF/views/joinform.jsp";
	}
	
	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.POST)  //두개있을땐 value를 써준다
	public String join(@ModelAttribute UserVo vo){  //변수에 뭐가있는지 살펴서 같은게 있으면 담아서 쓴다.
			
			System.out.println(vo);
			return "redirect:/user/joinsuccess"; //request.getContextPath;
		}
		
	@ResponseBody
	@RequestMapping("/joinsuccess")
	public String joinSuccess(){
		return "joinSuccess";
	}
	
	
	
	}
