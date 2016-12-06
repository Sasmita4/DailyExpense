package com.daily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DailyExpenseController {
	@RequestMapping(value = { "/", "/test" })
	public ModelAndView testPage() {
		ModelAndView view = new ModelAndView("index");
		return view;
	}
 
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView homePage() {
		ModelAndView view = new ModelAndView("welcome");
		return view;
	}
	@RequestMapping(value = "/login")
	public ModelAndView loginPage(){
		ModelAndView view = new ModelAndView("login");
		return view;
	}
	@RequestMapping(value = "/food")
	public ModelAndView foodPage(){
		ModelAndView view =new ModelAndView("food");
		return view;
	}
	
	@RequestMapping(value = "/transportation")
	public ModelAndView transportationPage(){
		System.out.println("Inside transportation page");
		ModelAndView view =new ModelAndView("transportation");
		return view;
	}
	
	@RequestMapping(value = "/miscellaneous")
	public ModelAndView miscellaneousPage(){
		ModelAndView view =new ModelAndView("miscellaneous");
        System.out.println("Inside miscellaneous Page");
		return view;
	}
}
