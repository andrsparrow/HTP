package com.pht.lesson2;

import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {
		// Вывести заданное количество случайных чисел с переходом и без перехода
		//на новую строку


		Scanner sc= new Scanner(System.in);
		while(!sc.hasNextInt()){
			System.out.println("error input");
		}
		int count=sc.nextInt();
		for(int i=0;i<count;i++){
			System.out.println(Math.random());
		}
		System.out.println("//////////////////");
		for(int i=0;i<count;i++){
			System.out.print(Math.random());
		}
		sc.close();
		
	}

}
