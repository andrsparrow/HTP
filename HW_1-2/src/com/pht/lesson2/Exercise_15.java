package com.pht.lesson2;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		//Ввести с консоли n целых чисел. На консоль вывести:
		//Все трехзначные числа, в десятичной записи которых нет одинаковых
		//цифр.

		
		System.out.println("input numbers 5");
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[5]; 
		for(int i=0;i<arr.length;i++){
			while(!sc.hasNextInt()){
				System.out.println("error input");
			}
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			int a=arr[i]/100;
			int b=(arr[i]%100)/10;
			int c=arr[i]%10;
		
			if(a!=b&&a!=c&&b!=c){
				System.out.println(arr[i]);
			}
		}
		
		sc.close();	
		
	}

}
