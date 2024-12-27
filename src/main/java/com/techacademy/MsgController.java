package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

	@GetMapping("/msg")
	public String getMsg() {
		//msg.htmlに画面遷移
		return "msg";
	}
}
