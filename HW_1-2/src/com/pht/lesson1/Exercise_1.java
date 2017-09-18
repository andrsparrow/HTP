package com.pht.lesson1;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("INput 2 numbers:");
		int firstNumber=scanInt(sc);
		int secontNumber=scanInt(sc);
		System.out.println("input action (*,/,+,-)");
		String action=scanAction(sc);
		prinrResult(action, firstNumber, secontNumber);
	}
	
	
	
	static void prinrResult(String check,int firstNumber,int secontNumber){
		System.out.println("result:");
		switch(check){
		case("*"):System.out.print(firstNumber*secontNumber);
			break;
		case("+"):System.out.print(firstNumber+secontNumber);
			break;
		case("-"):System.out.print(firstNumber-secontNumber);
			break;
		case("/"):System.out.print(firstNumber/secontNumber);
			break;
		default:System.out.println("smth wrong!..");
				break;
		}
		
	}

	static int  scanInt(Scanner sc){
		while(!sc.hasNextInt()){
			System.out.println("incorrect input");
			sc.next();
		}
		return sc.nextInt();
		
	}

	static String scanAction(Scanner sc){
		
		String action=sc.next();
		while(!(action.equals("*")
						||action.equals("/")
						||action.equals("-")
						||action.equals("+"))){
			System.out.println("incorrect input");
			 action=sc.next();	
		}
		return action;
	}

}
