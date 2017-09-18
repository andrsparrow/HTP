package com.htp.test1;

public class Main {

	public static void main(String[] args) {
		
		ex1();
		ex2();
		ex3();
		ex4();
		ex5();
		ex6();
	}
	
	
	
	
	
	
	
	
	public static int[] array(int n){
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*10);
		}
	
		return arr;
		
	}
	
	public static void show(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	
	public static void ex1(){
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("EX1");
		int[] arr=array(10);
		show(arr);
		int indexMin=0;
		int indexMax=0;
		System.out.println("///////");
		for(int i=0;i<arr.length;i++){
			if(arr[i]>arr[indexMax]){
				indexMax=i;
			}
				
			if(arr[i]<arr[indexMin]){
				indexMin=i;
			}
			
		}
		System.out.println("index max= "+indexMax+"["+arr[indexMax]+"]");
		System.out.println("index min= "+indexMin+"["+arr[indexMin]+"]");
		
		int temp=arr[indexMax];
		arr[indexMax]=arr[indexMin];
		arr[indexMin]=temp;
		
		show(arr);
		System.out.println("////////////////////");
		System.out.println("////////////////////");
	}
	
	public static void ex2(){
		
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("EX2");
		int[] arr=array(10);
		show(arr);
		System.out.println("///////");
		int tempMax=arr[0];
	
		for(int i=0;i<arr.length;i++){
			if(arr[i]>tempMax){
				tempMax=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]/tempMax;
		}
		show(arr);
		System.out.println("////////////////////");
		System.out.println("////////////////////");
		
		
	}
	
	public static void ex3(){
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("EX3");
		double [] A=new double[20];
		int count=0;
		for(int i=0;i<A.length;i++){
			A[i]=(double)(int)((Math.random()*50-30)*100)/100;
			
			if(A[i]>0&&i%2==0)
				count++;
		}
		
		for(int i=0;i<A.length;i++){
			System.out.println(A[i]);
		}
		System.out.println("///////\nPositiv with even index");
	
		double []B=new double[count];
		int index=0;
		for(int i=0;i<A.length;i++){
			if(A[i]>0&&i%2==0){
				B[index]=A[i];
				index++;
			}
		}

		for(int i=0;i<B.length;i++){
			System.out.println(B[i]);
		}
		System.out.print("///////\nsumm squares=");
		double summ=0;
		for(int i=0;i<B.length;i++){
			summ+=B[i]*B[i];
		}
		System.out.print(summ+"\n");
	}
	
	public static void ex4(){
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("EX4");
		System.out.println();
		
		int [][] matrix=new int[4][4];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j]=(int)(Math.random()*10);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		int [] temp =matrix[0];
		matrix[0]=matrix[3];
		matrix[3]=temp;
		System.out.println("////////////");
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void ex5(){
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("EX4");
		
		int [][] matrix=new int[4][4];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j]=(int)(Math.random()*10);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("////////////////////\nMax:");
		
		int [] max=new int[4];
		
		for(int i=0;i<matrix.length;i++){
			
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]>max[j])
					max[j]=matrix[i][j];
			}
		}
		
		for(int i=0;i<max.length;i++){
			System.out.print(max[i]+" ");
		}
	}

	
	public static void ex6(){
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("EX6");
		int x=4;
		int count=0;
		int [][] matrix=new int[4][4];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j]=(int)(Math.random()*10);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("////////////////////\n "+x+" :=");
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]==x)
					count++;
			}
		}
		System.out.print(count +" times");
		
		
		
		
	}
	
	

}
