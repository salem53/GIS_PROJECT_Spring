package com.hin.spatial.postgis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hin.spatial.postgis.model.City;
import com.hin.spatial.postgis.service.CityService;
@CrossOrigin("*")
@RestController
@RequestMapping("city")
public class CityController {

	@Autowired
	private CityService service;

	@GetMapping("{lat}/{lon}/{distanceM}")
	public List<City> getCityNear(
			@PathVariable double lat, 
			@PathVariable double lon, 
			@PathVariable double distanceM){
		return service.findAround(lat, lon, distanceM);
	}
	
}
