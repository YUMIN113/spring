package com.example.core.practice15;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArrayAndListController {
	// 배열
    @RequestMapping(value = "/view/request/bizArray")
    public String bizArray(Model model) {

        // String 배열
        String[] stringArray = { "아메리카노", "레몬에이드", "홍차" };
        model.addAttribute("stringArray", stringArray);

        // User 배열
        User[] userArray = { 
                new User("james", "1234", "제임스"), 
                new User("victoria", "5678", "빅토리아"),
                new User("santiago", "9090", "산티아고") 
            };
        model.addAttribute("userArray", userArray);

        return "practice15/bizArray";
    }
    
    // List
    @RequestMapping(value = "/view/request/bizList")
    public String bizList(Model model) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("아메리카노");
        stringList.add("레몬에이드");
        stringList.add("홍차");
        model.addAttribute("stringList", stringList);

        List<User> userList = new ArrayList<User>();
        userList.add(new User("james", "1234", "제임스"));
        userList.add(new User("victoria", "5678", "빅토리아"));
        userList.add(new User("santiago", "9090", "산티아고"));
        model.addAttribute("userList", userList);

        return "practice15/bizList";
    }
}
