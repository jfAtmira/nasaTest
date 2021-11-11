package com.atmira.nasa.services;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.atmira.nasa.dto.Asteroid;


@Service
public class AsteroidsService {
	@Autowired
    RestTemplate restTemplate;
    public List<Asteroid> getAsteroids(){
        ResponseEntity<Asteroid[]> response =
                  restTemplate.getForEntity(
                  "https://api.nasa.gov/neo/rest/v1/neo/browse?API_KEY= zdUP8ElJv1cehFM0rsZVSQN7uBVxlDnu4diHlLSb",
                  Asteroid[].class);
        		  Asteroid[] asteroids = response.getBody();
                List<Asteroid> m = Arrays.asList(asteroids);
        return  m;
    }
}
