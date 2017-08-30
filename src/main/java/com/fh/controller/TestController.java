package com.fh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.base.BaseController;
import com.fh.base.Constant;
import com.fh.base.ResultInfo;
import com.fh.service.TestService;

@Controller
@RequestMapping(value="test")
public class TestController extends BaseController{
	
	@Autowired
	private TestService testService;
	
	
	@RequestMapping("git")
	@ResponseBody
	public ResultInfo idnex() {
		
		return success(Constant.SUCCESS_MSG);
	}
}
