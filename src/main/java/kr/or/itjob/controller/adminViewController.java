package kr.or.itjob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("adminview")
@Controller
public class adminViewController {
	
	@RequestMapping("login")
	public String loginView() {
		return "/adminlogin/adminlogin";
	}

	@RequestMapping("main")
	public String advancedView() {
		return "/admin/datatable";
	}
	
	@RequestMapping("admin_mypage")
	public String user_mypageView() {
		return "/admin/mypage";
		
	}
	
	@RequestMapping("codingTest")
	public String codingTestView() {
		return "/admin/codingTest";
	}
	
	@RequestMapping("calendarView")
	public String calendarView() {
		return "/admin/calendar";
	}
	@RequestMapping("faq")
	public String faqView() {
		return "/admin/faq";
	}
//test03
	@RequestMapping("mypage123123")
	public String mypageView123123() {

	//modify 
	@RequestMapping("mypage")
	public String mypageView() {
		return "/admin/mypagex";
	}
	//added
	@RequestMapping("mypage2")
	public String mypageView2() {
		return "/admin/mypage";
	}
	
}
