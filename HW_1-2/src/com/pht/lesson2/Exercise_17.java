package com.pht.lesson2;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		// Ввести с консоли n целых чисел. На консоль вывести:
				// Простые числа.

		Scanner sc = new Scanner(System.in);
		System.out.println("input numbers 5");

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			while (!sc.hasNextInt()) {
				System.out.println("error input");
			}
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int index = 0;
			for (int j = 2; j < Math.sqrt(arr[i]); j++) {
				if (arr[i] % j == 0)
					index = 1;
			}
			if (index == 0)
				System.out.println("easy");
			else
				System.out.println("not easy");
		}

		
		sc.close();
		
	}

}
