package com.haestate.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	String ping() {
		return "Server is up";
	}
}
