package com.example.demo.service;

import java.util.List;

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
public registration adding(List<E>)
}
