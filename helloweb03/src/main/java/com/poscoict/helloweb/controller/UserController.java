package com.poscoict.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @RequestMapping:클래스(타입) + 메소드(핸들러)
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("n") String name) { //요청파라미터가 n으로 넘어오면 name으로 세팅해줘 n=김손재//n이 없으면 400에러가 남
		/**
		 * 만일, n이라는 이름의 파라미터가 없는 경우
		 * 400 bad request 에러가 발생한다
		 */
		System.out.println(name);
		return "UserController.update()";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(
			@RequestParam(value="n", required=true, defaultValue="") String name,
			@RequestParam(value="a", required=true, defaultValue="0") Integer age) { //required=false이면 n=null값이 온다. defaultValue설정해놓으면 n=""로  
		System.out.println("-----"+name+"-----");
		System.out.println("-----"+age+"-----");
		return "UserController.update2()";//userController는 어디있음?
	}
}
