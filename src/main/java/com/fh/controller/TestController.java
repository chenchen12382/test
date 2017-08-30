package com.fh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fh.base.BaseController;
import com.fh.service.TestService;

@Controller
@RequestMapping(value="test")
public class TestController extends BaseController{
	
	@Autowired
	private TestService testService;
	
	public return_type name() {
		
	}
	
}
