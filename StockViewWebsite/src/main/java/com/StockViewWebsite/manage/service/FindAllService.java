package com.StockViewWebsite.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockViewWebsite.manage.dto.FindAllDTO;
import com.StockViewWebsite.manage.repository.FindAllRepository;

@Service

public class FindAllService {
	@Autowired
	public FindAllRepository findAllRepository;
	
	public List<FindAllDTO> findAll(){
		return findAllRepository.findAll();
	}
}
