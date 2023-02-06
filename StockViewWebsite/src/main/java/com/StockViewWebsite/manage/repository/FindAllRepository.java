package com.StockViewWebsite.manage.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StockViewWebsite.manage.dto.FindAllDTO;

@Repository

public class FindAllRepository {
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	// 비회원 - top20 조회
	public List<FindAllDTO> findAll() {
		return sessionTemplate.selectList("Main.findAll");
	}
	
	// 검색값 조회 		
	public List<FindAllDTO> search(String stockItemName){
		return sessionTemplate.selectList("Main.search", stockItemName);
	}
	
	// Detail
	public FindAllDTO detail(String itemCode) {
		return sessionTemplate.selectOne("Main.detail", itemCode);
	}
}
