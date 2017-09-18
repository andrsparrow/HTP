package by.htp.test1.library;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import by.htp.test1.paper.products.Book;
import by.htp.test1.paper.products.Magazine;

public class WorkWithLib {
	
	
	private Library lib;
	
	public WorkWithLib(Library library){
		if(library==null)System.out.println("err in constructor");
		else this.lib=library;
	}
	
	public WorkWithLib(){

		createLib();
	}
	
	public void createLib(){

		try{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Введите название библиотеки");
			String temp=bf.readLine();
			while(temp==null){
				System.out.println("error input\ntry again2");
				temp=bf.readLine();
			}
			lib=new Library(temp);
		}
		catch( Exception e){
			System.out.println(e.getMessage()+" create lib err");
		}

	}
	
	public boolean workWithOptions( int userInput){
		
		switch( userInput){
		case 1:
			System.out.println(lib.show());
			
			return true;
		case 2:
			lib.add(new Book());
			System.out.println(lib.show());
			return true;
		case 3:
			if(!lib.deletePaper(InputDelParametr()))
				System.out.println("no such book in lib");;
			return true;
		case 4:
			lib.add(new Magazine());
			return true;
		case 5:
			if(!lib.deletePaper(InputDelParametr()))
				System.out.println("no such book in lib");;
			return true;
		case 6:
			lib.sortingByNumber();;
			return true;
		case 7:
			lib.sortingByYear();;
			return true;
		case 8:
			System.out.println(lib.search(InputSearchParametrByAuthor()));
			return true;
		case 9:
			lib.search(InputSearchParametrByName());
			return true;
		case 10:
			new WorkWithFileLib(lib);
			return true;
		case 0:
			return false;
		default :System.out.println("err in case optnion");
			return false;
		}
		
		
	}
	
	private String InputDelParametr(){
	try{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("введите название книги");
		String temp=bf.readLine();
		return temp;
	}
	catch( Exception e){
		System.out.println(e.getMessage()+"input del param err");
		return null;
	}
}

	private String InputSearchParametrByAuthor(){
		try{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("введите имя автора");
			String temp=bf.readLine();
			System.out.println("введите фамилию автора");
			temp+=" "+bf.readLine();
			
			return temp;
		}
		catch( Exception e){
			System.out.println(e.getMessage()+" input search param by author err");
			return null;
		}
	}

	private String InputSearchParametrByName(){
		try{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("введите название издания");
			String temp=bf.readLine();
			
			
			return temp;
		}
		catch( Exception e){
			System.out.println(e.getMessage()+" input search param by name ");
			return null;
		}
	}


	
	
	
	
	
	
//
}
