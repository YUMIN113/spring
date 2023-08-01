package com.example.core.practice18;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ForwordController {

	@RequestMapping("/forward")
	public String forwordForm() {
		return "practice18/menuForm";
	}
	
	@RequestMapping("/move/forward/bizMenu")
	public String selectMenu(@RequestParam String menu, Model model) {
		
		model.addAttribute("menu", getMenuName(menu));
		
		return "practice18/menuResult";
	}

	public String getMenuName(String menu) {

        String menuName = "";
        if (menu != null) {
            switch (menu) {
            case "americano":
                menuName = "아메리카노";
                break;
            case "latte":
                menuName = "라떼";
                break;
            case "cappuccino":
                menuName = "카푸치노";
                break;
            }
        }

        return menuName;
    }
	
	@RequestMapping("/move/forward/bizMenuForward")
	public String bizMenuForword(@RequestParam String menu, HttpServletRequest request) {
		System.out.println("forward 실행");
		
		request.setAttribute("message", "시럽 가득");
		return "forward:/move/forward/finish";
	}
	
	@RequestMapping("/move/forward/finish")
	public String finish(@RequestParam String menu, Model model) {
		System.out.println("최종 실행");
			model.addAttribute("menu", "[주문완료] " + getMenuName(menu));
		return "practice18/menuForwardResult";
	}
}
