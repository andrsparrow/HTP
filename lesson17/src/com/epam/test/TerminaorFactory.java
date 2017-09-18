package com.epam.test;

public class TerminaorFactory {
	
	
	public static Terminator getTerminator(String value) {
		if("T800".equals(value)){
			return new T800(new SaveTarget("John Connor"));
		}else if("T1000".equals(value)){
			return new T1000(new KillTarget("Sara Connor"));
		}else if("T3000".equals(value)){
			return new T3000(new KillTarget("Sara Connor & Kyle Reese"));
		}else{
			throw new IllegalArgumentException("Bad value: "+ value);
		}
	}
}
