package by.pht.test2_solar_system;

public class Planet {
	private String name;
	private int size;
	private Moon [] moons;
	private String type;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Moon[] getMoons() {
		return moons;
	}

	public void setMoons(Moon[] moons) {
		this.moons = moons;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	
	public Planet(String name, int size,  String type,Moon... moon) {
		
		this.name = name;
		this.size = size;
		this.type = type;
		
		this.moons = new Moon[moon.length];
		for(int i=0;i<this.moons.length;i++){
			this.moons[i]=moon[i];
		}
	}

	public Planet(String name, int size, String type) {
	
		this.name = name;
		this.size = size;
		this.type = type;
	}

	public void showPlanet() {
		System.out.println("	planet name= "+name+"\n"+"		size= "+ size);
		
		if(moons==null){
			System.out.print( "		moons:");
			System.out.print(" no\n");
		
		}
		
		else{
			System.out.println( "		moons:");
			for(int i=0;i<moons.length;i++){
				System.out.println("			"+moons[i]);
			}
		}
		

	}
	
	
	
	
	
	

}
