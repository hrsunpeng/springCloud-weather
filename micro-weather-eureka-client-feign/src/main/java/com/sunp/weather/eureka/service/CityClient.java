package com.sunp.weather.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  城市信息的客户端 City Client
 * @author user
 *
 */
@FeignClient("micro-weather-city-eureka")
public interface CityClient {

	@GetMapping("/cities")
	String listCity();
	
	
}
