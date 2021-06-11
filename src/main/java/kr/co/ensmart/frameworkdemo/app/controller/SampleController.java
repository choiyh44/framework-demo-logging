package kr.co.ensmart.frameworkdemo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/sample")
@Slf4j
public class SampleController {
	@GetMapping("/main")
	String viewMain() {
		log.info("Sample log from SampleController.viewMain()");
		return "sample/main";
	}
	
}
