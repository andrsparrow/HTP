package by.pht.test2_solar_system;

public class Main {

	public static void main(String[] args) {
		
		Moon moon1=new Moon("moon1",2);
		Moon moon2=new Moon("moon2",1);
		
		Planet planet1= new Planet("Earh", 3, "ground",moon1,moon2);
		Planet planet2= new Planet("Venus", 3, "gas",moon2);
		Planet planet3= new Planet("Mars", 3, "ground");
		
		Star star= new Star("Star",50);
		
		SolarSystem solarSystem= new SolarSystem(star, planet1,planet2,planet3);
		solarSystem.show();
		
		
		System.out.println();
		System.out.println("////////////////////////////");
		solarSystem.countOfPlanets();
		solarSystem.nameOfStar();
		System.out.println("////////////////////////////");
		System.out.println("adding new planet:\n");
	
		
		Planet planet4= new Planet("Saturn", 10, "gas");
		solarSystem.addPlanet(planet4);
		solarSystem.show();
		
		
	}

}
