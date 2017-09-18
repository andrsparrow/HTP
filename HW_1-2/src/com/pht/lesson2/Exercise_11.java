package com.pht.lesson2;

public class Exercise_11 {

	public static void main(String[] args) {
		// Наибольшее и наименьшее число

		int max=Integer.parseInt(args[0]);
		int min=Integer.parseInt(args[0]);

		for(int i=0;i<args.length;i++){
		
			if(Integer.parseInt(args[0])>max)
				max=Integer.parseInt(args[0]);
			if(Integer.parseInt(args[0])<min)
				min=Integer.parseInt(args[0]);
		
		}
		System.out.println("max:"+max);
		System.out.println("min: "+min);
		
	}
}
