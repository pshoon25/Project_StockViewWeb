package com.StockViewWebsite.manage.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StockViewWebsite.manage.dto.ItemOfInterestDTO;
import com.StockViewWebsite.manage.dto.SignUpDTO;

@Repository
public class SignUpRepository {
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	// 회원가입 
	public int signup(SignUpDTO dto) {
		return sessionTemplate.insert("Main.signup", dto);
	}
	
	// 관심 항목 추가	
	public int itemofinterest(ItemOfInterestDTO dto) {
		return sessionTemplate.insert("Main.itemofinterest", dto);
	}
}
