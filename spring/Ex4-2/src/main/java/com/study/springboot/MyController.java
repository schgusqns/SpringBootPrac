package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller

public class MyController {

	@RequestMapping("/")
		public @ResponseBody String root() throws Exception{
	
		return "Form데이터 전달받아 사용하기";
	}
	
	//Model, ModelAndView : Model로 데이터를 반환하거나 화면까지 지정
	@RequestMapping("/test1")
		public String test1(HttpServletRequest httpServletRequest, Model model) { //test1?id=qqq&name=ttt
		
		String id=httpServletRequest.getParameter("id");
		String name=httpServletRequest.getParameter("name");
		
		model.addAttribute("id",id);
		model.addAttribute("name",name);
		
		return "test1";
	}
	
	@RequestMapping("/test2")
		public String test2(@RequestParam("id")String id, @RequestParam("name")String name, Model model) { //test2?id=qqq&name=ttt
	
		model.addAttribute("id",id);
		model.addAttribute("name",name);
	
		return "test2";
	}
	
	@RequestMapping("/test3")
		public String test3(Member member, Model model) { //test3?id=qqq&name=ttt

		//파라메터와 일치하는 빈을 만들어서 사용할 수 있다
		//view 페이지에서 model을 사용하지 않고 member를 사용한다.

		return "test3";
	}
	
	//패스 자체에 변수를 넣어 줄 수도 있음
	@RequestMapping("/test4/{studentid}/{name}")
		public String test4(@PathVariable("id")String studentid, @PathVariable("name")String name, Model model) { //test4/아이디/이름


		return "test4";
	}
	
}
