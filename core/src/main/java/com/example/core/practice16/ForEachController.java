package com.example.core.practice16;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForEachController {

	 @RequestMapping(value = "/view/jstl/bizForEach")
	    public String bizForEach(Model model) {

	        // List : String
	        List<String> travelList = new ArrayList<String>();
	        travelList.add("Barcelona");
	        travelList.add("Paris");
	        travelList.add("London");
	        model.addAttribute("travelList", travelList);

	        // List : User
	        List<User> userList = new ArrayList<User>();
	        userList.add(new User("spring", "123", "김봄"));
	        userList.add(new User("summer", "234", "김여름"));
	        userList.add(new User("fall", "345", "김가을"));
	        userList.add(new User("winter", "456", "김겨울"));
	        userList.add(new User("dawn", "567", "김새벽"));
	        model.addAttribute("userList", userList);

	        return "practice16/bizForEach";
	    }
}
