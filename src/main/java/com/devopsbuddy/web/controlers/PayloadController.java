package com.devopsbuddy.web.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayloadController {
	/** The login vie name */
	public static final String PAYLOAD_VIEW_NAME = "payload/payload";

	@RequestMapping("/payload")
	public String login() {
		return PAYLOAD_VIEW_NAME;
	}
}
