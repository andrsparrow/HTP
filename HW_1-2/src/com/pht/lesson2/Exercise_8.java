package com.pht.lesson2;

public class Exercise_8 {

	public static void main(String[] args) {
		// Ввести целые числа как аргументы командной строки,
		//подсчитать их суммы (произведения) и вывести результат на консоль

		int sum=0;
		int proizv=1;
		
		for(int i=0;i<args.length;i++){
			sum=sum+Integer.parseInt(args[i]);
			proizv=proizv*Integer.parseInt(args[i]);	
		
			
		}
		System.out.println("proizv: "+proizv);
		System.out.println("sum: "+sum);
	}

}
