package com.example.core.practice10;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamMapController {

	/* ===== Map =====
	- 요청 파라미터 전체를 Map으로 변환한다.
	- Syntax
	
			@RequestParam Map<Key, Value> 변수명
			- Map : Key 1개당 1개 Value
	*/
	

	// Form
	// 코딩
	
//	public String form() {
//		return "practice10/mapForm";
//	}

	@RequestMapping(value = "/requestParam/map/bizMap")
	public String bizMap(@RequestParam Map<String, String> paramMap) {		

		for(String key : paramMap.keySet()) {
            String value = (String) paramMap.get(key);
            System.out.println("bizMap() :: " + key + "=" + value + " ");
        }
		
		return "practice10/mapForm";
	}

}
