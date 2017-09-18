package com.pht.lesson2;

public class Exercise_12 {

	public static void main(String[] args) {
		//Числа, которые делятся на 3 или на 9

		for(int i=0;i<args.length;i++){
			if(Integer.parseInt(args[i])%3==0 || Integer.parseInt(args[i])%9==0)
				System.out.println("делится на 3 или 9");
			else
				System.out.println("не делится ");
			
				
			}
		
	}

}
