package com.pht.solar.system;

public class Moon extends AstronomicalObject {

	private ORIGIN origin;

	enum ORIGIN{
		NATURAL,
		ARTIFICAL
	}
	
	public Moon(String name, int size) {
		super(name,size);
		this.origin=ORIGIN.NATURAL;
	}
	
	
	
	
	public Moon(String name, int size,ORIGIN origin) {
		super(name,size);
		this.origin=ORIGIN.ARTIFICAL;
		
	}

	
	
	



	@Override
	public void boom() {
		if(super.getSize()==4)
		System.out.println("BOOMs moon!");
		else{
			System.out.println("mooon boom:(");
		}
	}




	@Override
	public void zooming(ACTION action, int zoomingIndex) {
		super.zooming(action, zoomingIndex);
		
		if(super.getSize()>5){
			super.setName("planet"+Math.random()*100);
		}
		
		
		if(super.getSize()<1){
			super.setName("asteroid"+Math.random()*100);
		}
	}




	@Override
	public String toString() {
		return "Moon name= "+super.getName()+
				"\n\t\tsize="+super.getSize()+
				"\n\t\torigin= "+origin+"\n";
	}





	
	

	
	
}
