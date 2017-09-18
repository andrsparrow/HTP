package com.pht.lesson1;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		System.out.println("input number:");
		int a = inputNumber();
		System.out.println("entered number  ");
		isDevOn2(a);
	}

	static int inputNumber() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while (a <= 0 || a >= 9) {

			System.out.println("incorrect input\ntry again");
			a = sc.nextInt();
		}
		sc.close();
		return a;
	}

	static void isDevOn2(int number) {

		if (number % 2 == 0)
			System.out.println("even number");
		else
			System.out.println("not even number");
		;

	}
}
