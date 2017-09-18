package com.pht.lesson2;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		// Программа запрашивает ввод строк текста. Продолжаем ввод до
	//тех пор, пока не будет введено слово “stop”.

		Scanner sc=new Scanner(System.in);
		String temp=sc.next();
		while(!temp.equalsIgnoreCase("stop")){
			System.out.println("lol  "+temp);
			temp=sc.next();
		}
		sc.close();
		System.out.println("end");
		
		
	}

}
