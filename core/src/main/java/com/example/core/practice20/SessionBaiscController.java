package com.example.core.practice20;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionBaiscController {

	@RequestMapping("/session")
	public String httpServletRequest(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		System.out.println("id=" + session.getId());
		
		long createTime = session.getCreationTime();
		String createTimeFormat = getCreateTimeFormat(createTime);
		System.out.println("create time=" + createTime);
		System.out.println("create time(format)=" + createTimeFormat);
		
		System.out.println("interval=" + session.getMaxInactiveInterval());
		
		session.setAttribute("hello", "안녕하세요");
		session.setAttribute("welcome", "반갑습니다.");
		
		return "practice20/sessionForm";
	}

	private String getCreateTimeFormat(long createTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date date = new Date();
		date.setTime(createTime);
		return sdf.format(date);
	}
}
