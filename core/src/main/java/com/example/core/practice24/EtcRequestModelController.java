package com.example.core.practice24;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EtcRequestModelController {

	public void printEnumeration(Enumeration<String> names) {
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			System.out.println(name);
		}
	}

	@RequestMapping(value = "/etc/requestModel/loginForm")
	public String loginForm() {
		return "practice24/loginForm";
	}

	@RequestMapping(value = "/etc/requestModel/login")
	public String login(
			HttpServletRequest request, 
			HttpSession session, 
			Model model,
			@RequestParam("id") String paramId, 
			@RequestParam("pw") String paramPw) {

		System.out.println("----- requset.getParameterNames() : START -----");
		printEnumeration(request.getParameterNames());
		System.out.println("----- requset.getParameterNames() : END -----");

		System.out.println("----- requset.getAttributeNames() : START -----");
		printEnumeration(request.getAttributeNames());
		System.out.println("----- requset.getAttributeNames() : END -----");

		System.out.println("----- session.getAttributeNames() : START -----");
		printEnumeration(session.getAttributeNames());
		System.out.println("----- session.getAttributeNames() : END -----");
		
		request.setAttribute("R_Id", "R-"+ paramId);	
		request.setAttribute("R_Pw", "R-"+ paramPw);
		
		session.setAttribute("S_Id", "S-" + paramId);
		session.setAttribute("S_Pw", "S-" + paramPw);
		
		model.addAttribute("M_Id", "M-" + paramId);
		model.addAttribute("M_Pw", "M-" + paramPw);

		return "practice24/loginResult";
	}

}
