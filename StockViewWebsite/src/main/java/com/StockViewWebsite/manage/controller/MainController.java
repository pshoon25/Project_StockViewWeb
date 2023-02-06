package com.StockViewWebsite.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.StockViewWebsite.manage.dto.FindAllDTO;
import com.StockViewWebsite.manage.service.FindAllService;

@Controller
public class MainController {
	
	@Autowired
	private FindAllService findAllService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET )
	public ModelAndView findAll(
			@ModelAttribute FindAllDTO dto
			) {
		List<FindAllDTO> allViews = findAllService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/home");
		mav.addObject("allViews", allViews);
		return mav;
	}
	

}
