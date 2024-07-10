package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.registration;
import com.example.demo.service.registrationservice;

@RestController
@RequestMapping("/api/v1")
public class registrationcontroller {
@Autowired
registrationservice service;

@PostMapping("/insertion")

public registration insertion(@RequestBody registration r) {
	return service.insertion(r);
}
}
