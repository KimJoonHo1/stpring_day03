package com.care.root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Qualifier("mmm")
	MemberService ms;
	
	@RequestMapping("insert")
	public String insert(Model model) {
		//ms = new MemberService();
		int result = ms.insert();
		System.out.println("ms : " + ms);
		model.addAttribute("result", 0);
		return "di/index";
	}
}
