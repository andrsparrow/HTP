package com.epam.test;

public class SaveTarget extends AbstractTarget {

	public SaveTarget(String value) {
		super(value);
	}

	
	public void show() {
		System.out.println("Save: "+value);
		
	}

}
