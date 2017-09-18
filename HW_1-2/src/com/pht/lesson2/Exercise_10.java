package com.pht.lesson2;

public class Exercise_10 {

	public static void main(String[] args) {
		// Ввести с консоли n целых чисел. На консоль вывести:
		//1. Четные и нечетные числа
	
		for(int i=0;i<args.length;i++){
		if(Integer.parseInt(args[i])%2==0)
			System.out.println("even");
		else
			System.out.println("not even");
		
			
		}


	}

}
