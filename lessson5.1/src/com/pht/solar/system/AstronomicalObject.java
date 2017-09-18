package com.pht.solar.system;

public class AstronomicalObject {
	
	enum ACTION{
		GROW,
		DECREASE
	}
	
	
	private String name;
	private int size;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public AstronomicalObject(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	
	
	public void boom(){
		System.out.println("Astro explosion!!!");
		
	}
	
	
	
	public void zooming(ACTION action,int zoomingIndex){
		if(action==ACTION.GROW){
			this.size=this.size+zoomingIndex;
		}
		
		if(action==ACTION.DECREASE){
			if(this.size>zoomingIndex)
			this.size=this.size-zoomingIndex;
			else
				System.out.println("index too big");
		}
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "AstronomicalObject name=" + name + ", size=" + size;
	}

}
