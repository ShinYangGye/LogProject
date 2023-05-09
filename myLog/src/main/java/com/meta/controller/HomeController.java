package com.meta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class HomeController {

	@GetMapping("/home")
	public String getHome() {
		log.info("Info #############################");
		log.warn("warn #############################");
		log.error("error #############################");
		return "Home";
	}
	
}
