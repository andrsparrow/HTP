package com.pht.lesson2;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		
		//Написать программу нахождения суммы большего и меньшего 
	//из 3х чисел.
	
		System.out.println("input 3 numbers: ");
		
		Scanner sc = new Scanner(System.in);
		int[] a= new int[3];
		for(int i=0;i<a.length;i++){
			while(!sc.hasNextInt()){
				System.out.println("error input");
				sc.next();
			}
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length;i++){
			if(a[i]>max) 
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		sc.close();
		
		
		

	}
	
	

}
