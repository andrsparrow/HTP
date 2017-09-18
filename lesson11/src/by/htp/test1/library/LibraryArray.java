package by.htp.test1.library;

import java.util.Scanner;

import by.htp.test1.paper.Paper;

public class LibraryArray {
	private static Library[] libs;
	
	public static void addLib(Library lib){
		if(libs==null){
			libs=new Library[1];
			libs[0]=lib;
			return;
		}
		
		if(lib==null){
			System.out.println("добавление пустой библиотеки");
			return;
		}
		
		
		Library[] temp = new Library[libs.length + 1];
		for (int i = 0; i < libs.length; i++) {
			temp[i] = libs[i];
		}
		temp[temp.length - 1] = lib;
		libs = new Library[temp.length];
		for (int i = 0; i < temp.length; i++) {
			libs[i] = temp[i];
		}
		
		
	}
	
	public static Library search(String libraryName){
		for(Library each:libs){
			if(each.getLibName().equalsIgnoreCase(libraryName)){
				return each;
			}
		}
		return null;
	}

	public static String showLibs(){
		String temp="libs\n";
		for(int i=0;i<libs.length;i++){
			temp+=i+")"+libs[i].getLibName()+"\n";
		}
		return temp;
	}
	
	public static Library getLibrary(int index){
		try{
			Library temp=libs[index];
			return temp;
		}
		catch( Exception e){
			System.out.println(e.getMessage()+" ошибка в выборе библиотеки");
			return null;
		}
		
	}
	
	
	public static Library chooseLib(){
		System.out.println("выбирете библиотеку:");
		System.out.println(showLibs());
		Scanner sc= new Scanner(System.in);
		String usersInput=sc.next();
		while(!Paper.isNumber(usersInput)){
			System.out.println("input error\ntryagain");
			usersInput=sc.next();
		}
		int libIndex=Integer.parseInt(usersInput);
		return LibraryArray.getLibrary(libIndex);
	}

}
