package com.pht.solar.system;

public class SolarSystem {
	private Star star;
	private Planet[] planets;

	public SolarSystem(Star star, Planet... planets) {

		this.star = star;
		this.planets = planets;
	}

	public int countOfPlanets() {

		return planets.length;

	}

	public String nameOfStar() {
		return star.getName();
	}

	public void addPlanet(Planet planet) {
		Planet[] temp = new Planet[planets.length + 1];
		for (int i = 0; i < planets.length; i++) {
			temp[i] = planets[i];
		}
		temp[temp.length - 1] = planet;
		planets = new Planet[temp.length];
		System.arraycopy(temp, 0, planets, 0, temp.length);
	}

	@Override
	public String toString() {
		String temp;
		temp="Solar system:"+"\n"+star+"\n";
		for(int i=0;i<planets.length;i++){
			temp=temp+planets[i]+"\n";
		}
		return temp;
	}
	
	
	
	public void sortByPlanetsSize(){
		for(int i=0;i<planets.length;i++){
			for(int j=i+1;j<planets.length;j++)
			if(planets[j].getSize()>planets[i].getSize()){
				Planet temp=planets[j];
				planets[j]=planets[i];
				planets[i]=temp;
			}
		}
		
		
	}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
