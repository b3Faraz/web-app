package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.beans.Detail;
import com.microservice.beans.Limits;
import com.microservice.configuration.Configuration;

@RestController
public class AppController {

	@Autowired
	private Configuration configurtaion;

	@GetMapping("/app/detail")
	public ResponseEntity<Detail> appDetail() {
		Detail detail = new Detail("webapp1");
		ResponseEntity<Detail> response = new ResponseEntity<Detail>(detail, HttpStatus.OK);
		return response;
	}

	@GetMapping("/limit")
	public Limits limit() {

		return new Limits(configurtaion.getMin(), configurtaion.getMax());
	}

}
