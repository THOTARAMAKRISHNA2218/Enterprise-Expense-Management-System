package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Signup;
import com.project.repository.SignupRepository;

@Service
public class SignupService {

	@Autowired
	private SignupRepository signupRepo;
	
	public void saveAll(Signup s) {
		signupRepo.save(s);
		System.out.println("Inserted");
	}
	
	public List<Signup> fetchAll(){
		return signupRepo.findAll();
	}
}
