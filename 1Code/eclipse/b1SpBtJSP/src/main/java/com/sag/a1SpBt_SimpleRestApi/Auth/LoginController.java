package com.sag.a1SpBt_SimpleRestApi.Auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginMethod() {		
		return "login";
	}
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String username, ModelMap mm) {
		
		mm.put("name", username);
		return "welcome";
	}

}
