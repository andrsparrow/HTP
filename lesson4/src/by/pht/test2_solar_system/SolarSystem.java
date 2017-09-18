package by.pht.test2_solar_system;

public class SolarSystem {
	private Star star;
	private Planet[] planets;
	
	
	
	
	public SolarSystem(Star star, Planet... planets) {

		this.star = star;
		this.planets = planets;
	}



	public void show() {
		System.out.println("solar system :");
		System.out.println("  star: ");
		System.out.println(star);
		System.out.println("  planets:");
		for(int i=0;i<planets.length;i++){
			planets[i].showPlanet();
		}

	}
	
	
	public void countOfPlanets(){
		System.out.println("count of planets: "+ planets.length);
		
	}
	
	public void nameOfStar(){
		System.out.println("Star name: "+star.getName());
	}
	
	
	public void addPlanet(Planet planet){
		Planet [] temp=new Planet[planets.length+1];
		for(int i=0;i<planets.length;i++){
			temp[i]=planets[i];
		}
		temp[temp.length-1]=planet;
		planets =new Planet[temp.length];
		System.arraycopy(temp, 0, planets,0, temp.length);
		
		
		
		
	}
	
	

}
