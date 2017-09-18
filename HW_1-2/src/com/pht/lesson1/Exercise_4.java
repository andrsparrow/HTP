package com.pht.lesson1;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		checkingMonth(inputMonth(sc));
	}
	
	static String inputMonth(Scanner sc){
		
		return sc.nextLine().toLowerCase();
	}
	static void checkingMonth(String month){
		switch(month){
		case("january"):case("february"):case("december"):
			System.out.println("Winter");
		break;
		case("june"):case("july"):case("august"):
			System.out.println("summer");
		break;
		case("september"):case("october"):case("november"):
			System.out.println("fall");
		break;
		case("march"):case("april"):case("may"):
			System.out.println("spring");
		break;
		default:System.out.println("no such month...");
		}
	}

}
