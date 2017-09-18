package com.pht.solar.system;

public class Star extends AstronomicalObject {

	private int Temperature;

	
	
	
	@Override
	public void boom() {
		System.out.println("Звезда умерла");
		System.out.println("родилась дыра. черная дыра");
	}

	@Override
	public void zooming(ACTION action, int zoomingIndex) {
		if(action==ACTION.GROW){
			Temperature++;
		}
		
		if(action==ACTION.DECREASE){
			
			Temperature--;
		}
		
		super.zooming(action, zoomingIndex);
	}
	
	
	
	
	
	
	public Star(String name, int size) {
		super(name, size);

	}

	public Star(String name, int size, int Temperature) {
		super(name, size);
		this.Temperature = Temperature;

	}

	@Override
	public String toString() {
		String temp;
		temp = "Star\tname=" + super.getName() + "\n\tsize=" + super.getSize() + "\n\ttemperatue=" + Temperature;

		return temp;
	}

	public int getTemperature() {
		return Temperature;
	}

	public void setTemperature(int temperature) {
		Temperature = temperature;
	}
	public String getName() {
		return super.getName();
	}
	
	
	

}
