package com.gibisboard.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gibisboard.entity.GIBIS_MR_M;
import com.gibisboard.serviceImpl.ServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@org.springframework.stereotype.Controller
public class Controller {

	
	private ServiceImpl service;

	@Autowired
	public Controller(ServiceImpl service) {
		this.service = service;
	}

	@GetMapping(value = "/home")
	public String findAll( Model model) {
		
		try {
			List<GIBIS_MR_M>  list = service.findAll();
    	
    	for(GIBIS_MR_M i : list ) {
    		System.out.println(i);
    	}
    	
    	model.addAttribute("list",list);
    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return "home";
	}
	
}
