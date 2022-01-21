package com.poscoict.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @RequestMapping:클래스(타입) 단독 매핑
 *
 */
@Controller
@RequestMapping("/guestbook/")
public class GuestbookController {
	
	//바로 string으로 나와버림:responsebody
	@ResponseBody
	@RequestMapping //guestbook/list로 매핑주면 됨
	public String list() {
		return "GuestbookController.list()";
	}
	
	@ResponseBody
	@RequestMapping //guestbook/list로 매핑주면 됨
	public String delete() {
		return "GuestbookController.delete()";
	}
}
