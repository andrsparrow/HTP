package com.pht.lesson2;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		// Отсортированные числа в порядке возрастания и убывания.
		

		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}

		}
		
		System.out.println("up: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}

		}
		System.out.println("\ndown: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		
		
		
		sc.close();

		
		

	}

}
