package com.miapp.travel_diary.Demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/apo/v1")
@RequiredArgsConstructor
public class DemoController {

	@PostMapping(value = "demo")
	public String welcome() {
		return "Welcome from secure endpoint";
	}
	
}
