package com.example.core.practice09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamInputController {

	/*
	===== checkbox =====
		- <input type="checkbox"> 처리
		- 요청 파라미터 : 다수 개
	*/
	
	// ----- 여행 -----
	// Form
	// 코딩
	
	// main
	@RequestMapping("/main")
	public String mainForm() {
		return "practice09/main";
	}
	
	// radio
	@RequestMapping("/input/radioForm")
	public String radioForm() {
		return "practice09/radio";
	}
	
	@RequestMapping("/input/radio")
	public String radioCheck(@RequestParam String agree) {
		
		System.out.println("bizRadioAgree() :: agree=" + agree);
		return "practice09/radio";
	}
	
	// checkbox
	@RequestMapping("/input/checkboxForm")
	public String checkboxForm() {
		return "practice09/checkbox";
	}
	
	@RequestMapping("/input/checkbox")
	public String checkbox(@RequestParam(defaultValue="false") String agree) {
		System.out.println("bizCheckboxAgree() :: agree=" + agree);
		return "practice09/checkbox";
	}

	// travel select
	@RequestMapping("/input/travel/selectForm")
	public String travelSelectForm() {
		return "practice09/select";
	}
	
	@RequestMapping("/input/travel/select")
	public String travelSelect(@RequestParam String travel) {
		System.out.println("bizCheckboxTravel() :: travel=" + travel);
		return "practice09/select";
	}
	
	// travel checkbox
	@RequestMapping("/input/travel/checkboxForm")
	public String travelCheckForm() {
		return "practice09/travelCheckbox";
	}
	
	@RequestMapping(value = "/input/travel/checkbox")
	public String bizCheckboxTravel(@RequestParam(name="travel", defaultValue="0") String[] travelArray) {
		
		for(int i=0;i<travelArray.length;i++) {
			System.out.println("bizCheckboxTravel() :: travel=" + travelArray[i]);
		}

		return "practice09/travelCheckbox";
	}

}
