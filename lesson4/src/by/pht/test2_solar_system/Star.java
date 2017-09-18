package by.pht.test2_solar_system;

public class Star {
	private int size;
	private String name;
	
	
	
	public Star( String name,int size) {
		super();
		this.size = size;
		this.name = name;
	}



	@Override
	public String toString() {
		return "	name= "+name+				"\n	size= "+size ;
	}
	
	
	public String getName(){
		return name;
	}
	
	
	

}
