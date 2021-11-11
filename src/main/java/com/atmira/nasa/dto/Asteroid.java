package com.atmira.nasa.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Asteroid {

	@Id
    @GeneratedValue
	Long id;
	String name;
	String diameter;
	String speed;
	String date;
	String planet;
	
	public Asteroid() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param diameter
	 * @param speed
	 * @param date
	 * @param planet
	 */
	public Asteroid(Long id, String name, String diameter, String speed, String date, String planet) {
		super();
		this.id = id;
		this.name = name;
		this.diameter = diameter;
		this.speed = speed;
		this.date = date;
		this.planet = planet;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the diameter
	 */
	public String getDiameter() {
		return diameter;
	}

	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	/**
	 * @return the speed
	 */
	public String getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the planet
	 */
	public String getPlanet() {
		return planet;
	}

	/**
	 * @param planet the planet to set
	 */
	public void setPlanet(String planet) {
		this.planet = planet;
	}

	@Override
	public String toString() {
		return "Asteroid [id=" + id + ", name=" + name + ", diameter=" + diameter + ", speed=" + speed + ", date="
				+ date + ", planet=" + planet + "]";
	}
	
}
