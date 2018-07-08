package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/**
	 * 
	 * @param message
	 * @return
	 */
	@GetMapping("sayhello")
	public  List<Object> sayHello(@RequestParam(name="message") String message) {
		return Arrays.asList(message,new DummyModel(1234, "asasas"));
	}
}
