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
	
	public List<FindAllDTO> findAll() {
		return sessionTemplate.selectList("Main.findAll");
	}

}
