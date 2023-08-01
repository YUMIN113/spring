package com.example.core.practice19;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedirectController {

	@RequestMapping("/redirect/menuForm")
	public String redirectForm() {
		return "practice19/menuForm";
	}
	
	@RequestMapping("/move/redirect/bizMenuRedirect")
	public String bizMenuRedirect(@RequestParam String menu) {
		System.out.println("redirect 실행");
		return "redirect:/move/redirect/finish";
	}
	
	@RequestMapping("/move/redirect/finish")
	public String finish(@RequestParam(required=false) String menu, Model model) {
		
		model.addAttribute("menu", "[주문완료] " + getMenuName(menu));
		return "practice19/menuResult";
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
}
