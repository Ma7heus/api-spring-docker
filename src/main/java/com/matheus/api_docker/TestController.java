package com.matheus.api_docker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/test")
public class TestController {
	
	@GetMapping
	ResponseEntity<String> getTest(){
		return ResponseEntity.status(HttpStatus.OK).body("DEU CERTO!");
	}

}
