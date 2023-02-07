package com.StockViewWebsite.manage.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.StockViewWebsite.manage.HomeController;
import com.StockViewWebsite.manage.dto.FindAllDTO;
import com.StockViewWebsite.manage.dto.ItemOfInterestDTO;
import com.StockViewWebsite.manage.dto.SignUpDTO;
import com.StockViewWebsite.manage.service.FindAllService;
import com.StockViewWebsite.manage.service.SignUpService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	@Autowired
	private FindAllService findAllService;
	@Autowired
	private SignUpService signUpService;
	
	
	// View (비회원) 
	@RequestMapping(value="/home", method=RequestMethod.GET )
	public ModelAndView findAll(
			@ModelAttribute FindAllDTO dto,
			HttpServletRequest req
			) {
		List<FindAllDTO> allViews = findAllService.findAll();
		ModelAndView mav = new ModelAndView();
		String memberName = (String) req.getSession().getAttribute("memberName");
		mav.setViewName("/home");
		mav.addObject("allViews", allViews);
		return mav;
	}
	
	// Searching
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public ModelAndView search(
			@RequestParam("stockItemName") String stockItemName,
			@ModelAttribute FindAllDTO dto
			) {
		List<FindAllDTO> searchViews = findAllService.search('%'+stockItemName+'%');
//		logger.info(stockItemName.toString());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/home");
		mav.addObject("searchViews", searchViews);
//		logger.info(searchViews.toString());
		return mav;
	}
	
	// 상세보기  
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public ModelAndView detail(
			@RequestParam("itemCode") String itemCode,
			@ModelAttribute FindAllDTO dto
			) {
		FindAllDTO detailView = findAllService.detail(itemCode);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/detail");
		mav.addObject("detailView", detailView);
		return mav;
	}
	
	// 로그인창
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginView() {
		return "/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(
			@RequestParam("memberId") String memberId,
			@RequestParam("memberPw") String memberPw,
			HttpServletRequest req
			) {
		SignUpDTO dto = new SignUpDTO(memberId, memberPw);
		logger.info(dto.toString());
		ModelAndView mav = new ModelAndView();
		try {
			SignUpDTO dto2 = signUpService.login(dto);
			logger.info(dto2.toString());
			mav.setViewName("redirect:/home");
			HttpSession session = req.getSession();
			session.setAttribute("memberId", dto2.getMemberId());
			session.setAttribute("memberName", dto2.getMemberName());
			session.setMaxInactiveInterval(10);
		} catch (NullPointerException e) {
			mav.setViewName("redirect:/login");
		}
		return mav;
	}
	
	// 회원가입  
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signupView(
		@ModelAttribute FindAllDTO dto
		) {
		List<FindAllDTO> allViews = findAllService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/signup");
		mav.addObject("allViews", allViews);
		return mav;
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signup(
			@RequestParam("memberId") String memberId,
			@RequestParam("memberPw") String memberPw,
			@RequestParam("memberName") String memberName,
			@RequestParam("memberBirth") Integer memberBirth,
			@RequestParam("stockItemName") List<String> stockItemName
			) {
		SignUpDTO dto = new SignUpDTO(memberId, memberPw, memberName, memberBirth);
		
		List<ItemOfInterestDTO> dto3 = new ArrayList();
		for (String name : stockItemName) {
			dto3.add(new ItemOfInterestDTO(memberId, name));
		}
		logger.info(dto3.toString());
		List<Integer> inserRow = signUpService.add(dto3);
		int insertRow = signUpService.signup(dto);
		ModelAndView mav = new ModelAndView();
		if(insertRow != 0) {
			mav.setViewName("redirect:/login");
		}else {
			mav.setViewName("redirect:/signup");
		}
		return mav;
	}
}
