package com.gorbich.beta.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	public static final String MEMBER_VIEW_NAME = "member/member";

	@RequestMapping("/member")
	public String member() {
		return MEMBER_VIEW_NAME;
	}

}
