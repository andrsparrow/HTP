package com.htp.test2;

public class ArrList {
	
	private Object[] array;
	
	public  ArrList(){	
	}
	
	public  ArrList(int capacity){
		
		 this.array =new Object[capacity];
		
	}
	
	public  ArrList(int [] array){
		
		Object [] temp =new Object[array.length];
		for(int i=0;i<array.length;i++){
			temp[i]=(Object)array[i];
		}
		this.array =temp;
	}
	
	public  ArrList(Object [] array){
	
		this.array =array;
	}

	public  ArrList(char [] array){
		
		Object [] temp =new Object[array.length];
		for(int i=0;i<array.length;i++){
			temp[i]=(Object)array[i];
		}
		this.array =temp;
	}
	
	public  ArrList(double [] array){
		
		Object [] temp =new Object[array.length];
		for(int i=0;i<array.length;i++){
			temp[i]=(Object)array[i];
		}
		this.array =temp;
	}
	
	public  ArrList(String string){
		char [] array=string.toCharArray();
		Object [] temp =new Object[array.length];
		for(int i=0;i<array.length;i++){
			temp[i]=(Object)array[i];
		}
		this.array =temp;
	}
	
	public Object get( int index){
		return array[index];
	}

	public void add(Object object){
		
		
		Object[] temp=new Object[array.length+1];
		for(int i=0;i<array.length;i++){
			temp[i]=array[i];
		}
		
		temp[temp.length-1]=object;
		 array=new Object[temp.length];
		 for(int i=0;i<temp.length;i++){
			 array[i]=temp[i];
		 }
		 
		 
		
	}

	public void add(int [] array){
		
		Object [] temp =new Object[array.length+this.array.length];
		for(int i=0;i<this.array.length;i++){
			temp[i]=this.array[i];
		}
		
		for(int i=0;i<array.length;i++){
			temp[this.array.length+i]=(Object)array[i];
		}
		
		
		 this.array=new Object[temp.length];
		 for(int i=0;i<temp.length;i++){
			 this.array[i]=temp[i];
		 }
		
		
		
		
	}
	
	public void add(int startIndex ,Object object ){
		
		
		Object[] temp=new Object[array.length+1];
		for(int i=0;i<startIndex;i++){
			temp[i]=array[i];
		}
		temp[startIndex]=object;
		for(int i=startIndex+1;i<array.length+1;i++){
			temp[i]=array[i-1];
		}
		
		 array=new Object[temp.length];
		 for(int i=0;i<temp.length;i++){
			 array[i]=temp[i];
		 }
	}
	
	public void remove(int index){
		
		Object[] temp=new Object[array.length-1];
		for(int i=0;i<index;i++){
	
			temp[i]=array[i];
		}
		for(int i=index;i<temp.length;i++){
			
			temp[i]=array[i+1];
		}
		
		
		 array=new Object[temp.length];
		 for(int i=0;i<temp.length;i++){
			 array[i]=temp[i];
		 }
	}
	
	public int size(){
		return this.array.length;
	}
	
	@Override
	public String toString() {
		StringBuilder temp=new StringBuilder("ArrList [array=");
		for(int i=0;i<array.length;i++){
			temp.append(" ").append(array[i]).append(" ");		
			}
		temp.append(" ]");
		
		return temp.toString();
	}
	
	
	
	

}
