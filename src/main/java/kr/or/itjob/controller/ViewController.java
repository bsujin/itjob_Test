package kr.or.itjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("view")
@Controller
public class ViewController {
	
	@RequestMapping("main")
	public String advancedView() {
		return "tiles.main.advanced";
	}
	
	@RequestMapping("login")
	public String loginView() {
		return "tiles.login.login";
	}
	
	@RequestMapping("user_mypage")
	public String user_mypageView() {
		return "tiles.user_mypage.mypage";
	}
	
	@RequestMapping("codingTest")
	public String codingTestView() {
		return "tiles.user_mypage.codingTest";
	}
	
}
