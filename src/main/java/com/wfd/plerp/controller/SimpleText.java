package com.wfd.plerp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Simple")
public class SimpleText {
	@RequestMapping(value = "/sub1", method = RequestMethod.GET)
	public String Display() {
		return "Hello All";
	}

	@RequestMapping(value = "/sub2", method = RequestMethod.GET)
	public String Display1() {
		return "Hello Good Morning";
	}

}
