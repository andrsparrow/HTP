package com.pht.lesson2;

public class Exercise_5 {

	public static void main(String[] args) {
		
		
		//Отобразить в окне консоли аргументы командной строки в обратном
		//порядке.
		for(int i=args.length-1;i>0;i--){
			System.out.println(args[i]);
		}

	}

}
