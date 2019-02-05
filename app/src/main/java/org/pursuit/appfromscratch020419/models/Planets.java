package org.pursuit.appfromscratch020419.models;

import java.util.List;

public class Planets {

	public Planets(List<Planet> planets) {
		this.planets = planets;
	}

	private List<Planet> planets;

	public void setPlanets(List<Planet> planets){
		this.planets = planets;
	}

	public List<Planet> getPlanets(){
		return planets;
	}

}