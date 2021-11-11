package com.atmira.nasa.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atmira.nasa.dto.Asteroid;

@RestController
public class AsteroidsApi {
	
	@RequestMapping(value="/asteroids", method=RequestMethod.GET)
	public Asteroid getById(){
		return new Asteroid(1L, "a", "100", "4000", "24-12-2021", "Marte");
	}
}
