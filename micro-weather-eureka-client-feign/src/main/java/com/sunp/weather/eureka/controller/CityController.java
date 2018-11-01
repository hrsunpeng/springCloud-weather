package com.sunp.weather.eureka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunp.weather.eureka.service.CityClient;

@Controller 
public class CityController {

	private static final Logger logger = LoggerFactory.getLogger(CityController.class);
	
	@Autowired
	private CityClient cityClient;
	
	@GetMapping("/cities")
	@ResponseBody
	public String listCities() {
		//  通过 feign 客户端来查询
		String str = cityClient.listCity();
		logger.info("-->通过 feign 客户端来查询  listCities={}",str);
		return str;
	}
	
}
