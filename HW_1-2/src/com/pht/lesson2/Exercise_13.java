package com.pht.lesson2;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		// Элементы, расположенные методом пузырька по убыванию модулей

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
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		sc.close();

	}

}
