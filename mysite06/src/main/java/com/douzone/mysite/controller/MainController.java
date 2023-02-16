package com.douzone.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.mysite.vo.UserVo;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		return "main/index";
	}
	
	@ResponseBody
	@RequestMapping("/msg01")
	public String message01() {
		return "hello world";
	}
	
	@ResponseBody
	@RequestMapping("/msg02")
	public String message02() {
		return "안녕 세상";
	}
	
	@ResponseBody
	@RequestMapping("/msg03")
	public Object message03() {
		UserVo vo = new UserVo();
		vo.setNo(1L);
		vo.setName("둘리");
		vo.setEmail("dooly@gmail.com");
		
		return vo;
	}
}
