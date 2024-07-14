package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.registration;
import com.example.demo.service.registrationservice;



@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200")
public class registrationcontroller {
@Autowired
registrationservice service;

@PostMapping("/insertion")

public registration insertion(@RequestBody registration r) {
	return service.insertion(r);
}
@PostMapping("/multiadd")
public Iterable<registration> mutliinsertion(@RequestBody List<registration> reg) {
	return service.multiinsertion(reg);
}
@GetMapping("/multifetching")
public List<registration> multifetch(){
	return service.multifetch();
}
@GetMapping("/singlefetching/{id}")
public Optional<registration> fetch(@PathVariable int id) {
	return service.fetch(id);
}
@GetMapping("/fetchbyemail/{email}")
public registration findByEmail(@PathVariable String email){
	return service.getbyEmail(email);
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
	return service.delete(id);
}
@PutMapping("/update")
public registration updateAll(@RequestBody registration reg) {
	return service.updateAll(reg);
}
}
