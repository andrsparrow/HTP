package com.pht.lesson1;

import java.util.Scanner;

public class Exercise_3 {


	public static void main(String[] args) {
		System.out.println("input number:");
	int a=inputNumber();
	System.out.println("entered number  ");
	isPositive(a);
		

	}
	static int inputNumber(){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a<=-9||a>=9){
	
			System.out.println("incorrect input\ntry again");
			a=sc.nextInt();
		}
		sc.close();
		return a;
	}

	static void isPositive(int number){
		
		if(number>0)
		System.out.println("possitive");
		if(number<0) System.out.println("negative");;
		
		
	}
}
