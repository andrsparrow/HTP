package com.epam.test;

public class KillTarget extends AbstractTarget {

	
	public KillTarget(String value) {
		super(value);
	}

	@Override
	public void show() {
		System.out.println("Kill: "+value);
	}

}
