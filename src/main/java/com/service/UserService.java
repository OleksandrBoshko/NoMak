package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository user;
	
	public void save(){
		
	}
	
	public void getAll(){
		
	}
}
