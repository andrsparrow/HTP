package com.epam.test;

public class T3000 extends Terminator {

	public T3000(Target target) {
		super(target);
	}

	@Override
	public void showTarget() {
		System.out.println(T3000.class.getSimpleName()+" target: ");
		super.showTarget();
	}
	
	
	

}
