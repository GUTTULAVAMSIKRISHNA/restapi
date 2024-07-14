package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.registration;
import com.example.demo.repository.registrationrepository;

@Service
public class registrationservice {

@Autowired
registrationrepository repo;

public registration insertion(registration r) {
	return repo.save(r);
}
public Iterable<registration> multiinsertion(List<registration> reg) {
	return repo.saveAll(reg);
}
public List<registration> multifetch(){
	return (List<registration>) repo.findAll();
}
public Optional<registration> fetch(int id) {
	return repo.findById(id);
}
public registration getbyEmail(String email) {
	return repo.findByEmail(email);
}

public String delete(int id) {
	repo.deleteById(id);
	return "successfully deleted :"+id;
}
public registration updateAll(registration reg) {
	int id=reg.getId();
	registration re=repo.findById(id).get();
	re.setId(reg.getId());
	re.setName(reg.getName());
	re.setEmail(reg.getEmail());
	re.setBranch(reg.getBranch());
	re.setMobile(reg.getMobile());
	return repo.save(reg);
}
}
