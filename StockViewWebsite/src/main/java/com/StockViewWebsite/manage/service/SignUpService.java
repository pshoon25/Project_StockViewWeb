package com.StockViewWebsite.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockViewWebsite.manage.dto.ItemOfInterestDTO;
import com.StockViewWebsite.manage.dto.SignUpDTO;
import com.StockViewWebsite.manage.repository.SignUpRepository;

@Service
public class SignUpService {
	@Autowired
	public SignUpRepository signUpRepository;
	
	
	// 회원가입  
	public int signup(SignUpDTO dto) {
		return signUpRepository.signup(dto);
	}
	
	// 관심항목 추가  
	public int itemofinterest(ItemOfInterestDTO dto) {
		return signUpRepository.itemofinterest(dto);
	}
}
