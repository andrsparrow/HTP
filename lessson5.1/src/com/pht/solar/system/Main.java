package com.pht.solar.system;

import com.pht.solar.system.AstronomicalObject.ACTION;
import com.pht.solar.system.Moon.ORIGIN;

public class Main {

	public static void main(String[] args) {
		
		Moon moon1=new Moon("moon1",2);
		Moon moon2=new Moon("moon2",1,ORIGIN.ARTIFICAL);
		Moon moon3=new Moon("moon3",4);
		Moon moon4=new Moon("moon4",5);

		Planet planet1=new Planet("Earth",5,"ground",moon1,moon2);
		Planet planet2=new Planet("Venus",6,"gas");
		
		Star star1=new Star("SUN",66,135000000);
			
		SolarSystem solarSystem=new SolarSystem(star1, planet1,planet2);
		System.out.println(solarSystem);
			
		System.out.println("//////////////////////////");
		System.out.println("count of planets:");
		System.out.println(solarSystem.countOfPlanets());
		
		System.out.println("////////////////////////////////");
		System.out.println("Star name in solar system");
		System.out.println(solarSystem.nameOfStar());
		

		System.out.println("////////////////////////////////");
		System.out.println("adding new planet:\n");
		Planet planet3=new Planet("Uran",1,"gas",moon3,moon4);
		solarSystem.addPlanet(planet3);
		System.out.println(solarSystem);
		
		System.out.println("////////////////////////////////");
		System.out.println("sorting by planets' size:\n");
		solarSystem.sortByPlanetsSize();
		System.out.println(solarSystem);
		
		
		System.out.println("////////////////////////////////");
		System.out.println("up moon1\n");
		moon1.zooming(ACTION.DECREASE, 3);
		System.out.println(moon1);
		
		System.out.println("////////////////////////////////");
		System.out.println("up moon1\n");
		moon1.zooming(ACTION.DECREASE, 1);
		System.out.println(moon1);
		
		System.out.println("////////////////////////////////");
		System.out.println("up planet2\n");
		planet2.zooming(ACTION.GROW, 3);
		System.out.println(planet2);
		
		System.out.println("////////////////////////////////");
		System.out.println("star die\n");
		star1.boom();
		
		
		
	
		
		
		
		
		
	}

}
