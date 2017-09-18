package com.epam.test;

public class App {
public static void main(String[] args) {
	
	

	Terminator t800 = TerminaorFactory.getTerminator("T800");
	t800.showTarget();
	Terminator t1000 =TerminaorFactory.getTerminator("T1000");
	t1000.showTarget();
	Terminator t3000 =TerminaorFactory.getTerminator("T3000");
	t3000.showTarget();
	
	
	
}
}
