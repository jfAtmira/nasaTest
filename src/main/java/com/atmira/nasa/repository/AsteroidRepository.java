package com.atmira.nasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atmira.nasa.dto.Asteroid;

public interface  AsteroidRepository extends JpaRepository<Asteroid, Integer> {    
}
