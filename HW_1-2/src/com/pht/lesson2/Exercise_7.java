package com.pht.lesson2;

import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {
		// Ввести пароль из командной строки и сравнить его со строкой-образцом
		System.out.println("input password:");
		Scanner sc= new Scanner(System.in);
		String pass=sc.next();
		if(pass.equals("password")){
			System.out.println("you guessed)");
		}
		else{
			System.out.println("not lucky");
		}
		sc.close();

	}

}
