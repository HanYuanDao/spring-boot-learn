package com.learn.springbootlearn.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 * 使用场景:
 * 功能实现:
 * 影响及风险:
 * @author : zhe.han@ucarinc.com
 * @since : 2020/5/4 10:27 AM
 **/
@RestController
@RequestMapping(value = "/test")
public class TestControlller {

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	@ResponseBody
	public Object getTest1() {
		return "111";
	}
}
