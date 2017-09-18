package com.pht.solar.system;

public class Planet  extends AstronomicalObject{
	
	private Moon [] moons;
	private String Composition;
	
	public Moon[] getMoons() {
		return moons;
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void boom() {
		
		System.out.println("Planet BOOM");
	}









	@Override
	public void zooming(ACTION action, int zoomingIndex) {
		if(action==ACTION.DECREASE){
			Moon[] temp = new Moon[moons.length + 1];
			for (int i = 0; i < moons.length; i++) {
				temp[i] = moons[i];
			}
			temp[temp.length - 1] = new Moon("moon after boom",2);
			moons = new Moon[temp.length];
			System.arraycopy(temp, 0, moons, 0, temp.length);
		}
		
		super.zooming(action, zoomingIndex);
		
		
	}









	public int getSize() {
		return super.getSize();
	}

	public void setMoons(Moon[] moons) {
		this.moons = moons;
	}

	public String getComposition() {
		return Composition;
	}

	public void setComposition(String Composition) {
		this.Composition = Composition;
	}

	
	
	
	public Planet(String name, int size,  String Composition,Moon... moon) {
		
		super(name,size);
		this.Composition = Composition;
		
		this.moons = new Moon[moon.length];
		for(int i=0;i<this.moons.length;i++){
			this.moons[i]=moon[i];
		}
	}

	public Planet(String name, int size, String Composition) {
	
		super(name,size);
		this.Composition = Composition;
	}

	
	@Override
	public String toString() {
		String temp;
		temp="Planet\tname="+super.getName()+"\n\tsize="+super.getSize();
		if(moons==null){
			temp=temp+"\n\tmoons: no";
		}
		
		else{
			temp=temp+"\n\tmoons: ";
			
			
			for(int i=0;i<moons.length;i++){
				temp=temp+"\n\t\t"+moons[i];
			}
		}
		

		return temp;
	}
	
	
	
	
	
	

}
