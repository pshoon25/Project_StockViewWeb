package com.StockViewWebsite.manage.service;

import java.util.ArrayList;
import java.util.List;

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
	public List<Integer> add(List<ItemOfInterestDTO> dto3){
		List<Integer> returnList = new ArrayList();
		for (ItemOfInterestDTO dto : dto3) {
			returnList.add(signUpRepository.itemofinterest(dto));
		}
		return returnList;
	}
	
	// 로그인 
	public SignUpDTO login(SignUpDTO dto) {
		return signUpRepository.login(dto);
	}
}
