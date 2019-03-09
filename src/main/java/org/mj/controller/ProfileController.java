package org.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	@RequestMapping("/get")
	public String profile() {
		return "profile/profile";
	}

}
