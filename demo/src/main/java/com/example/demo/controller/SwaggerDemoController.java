package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.Operation;

@Controller
public class SwaggerDemoController {

	@Operation(summary = "isRunning", description = "To check whether service is running or not")
	@GetMapping(value = "/isRunning", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("Service is running.", HttpStatus.OK);
	}
}
