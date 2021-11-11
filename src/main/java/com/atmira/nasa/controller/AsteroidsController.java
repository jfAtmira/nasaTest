package com.atmira.nasa.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atmira.nasa.dto.Asteroid;
import com.atmira.nasa.repository.AsteroidRepository;

@RestController
@RequestMapping("/asteroids")
public class AsteroidsController {

	@Autowired
    AsteroidRepository asteroidRepository;
    @RequestMapping("/")
    public List<Asteroid> getAllAsteroids(){
        List<Asteroid> asteroids = asteroidRepository.findAll();
        return asteroids;
    }
    
   
    @RequestMapping(value="/planet", method=RequestMethod.GET)
    public Asteroid getByPlanet(String planet){
        return new Asteroid(1L, "", "", "", "", "");
    }
}
