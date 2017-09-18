package by.htp.test1.library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import by.htp.test1.paper.products.Book;
import by.htp.test1.paper.products.Magazine;

public class WorkWithFileLib {
	
	private Library lib;
	private File input;
	private File output;
	private FileInputStream fis;
	private FileOutputStream fos;
	
	private  void init(){
		output = new File( "data//output.txt");
		input = new File( "data//input.txt");
		try {
			output.createNewFile();
			words(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public WorkWithFileLib(Library library){
		if(library==null)
			System.out.println("err in WorkWithFileLib constructor");
		else {
			this.lib=library;
			init();
			words(input);
		}
	}
	
	
	
	public WorkWithFileLib(){
		createLib();
		init();
		words(input);
	}
	
	public void createLib(){
		lib=new Library("lib#"+lib.hashCode());
	}
	
	public ArrayList words(File file){
		int size=0;
		ArrayList<String> words= new ArrayList<String>();
		try {
			BufferedReader bf= new BufferedReader(new FileReader( file));
			String inputLine;
			while((inputLine=bf.readLine())!=null){
				//////////////
				
				String[] s = inputLine.split(" ");
				
				
				
				////////////////////
			}
		
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return null;
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
			//if(!lib.deletePaper(InputDelParametr()))
				System.out.println("no such book in lib");;
			return true;
		case 4:
			lib.add(new Magazine());
			return true;
		case 5:
			//if(!lib.deletePaper(InputDelParametr()))
				System.out.println("no such book in lib");;
			return true;
		case 6:
			lib.sortingByNumber();;
			return true;
		case 7:
			lib.sortingByYear();;
			return true;
		case 8:
			//lib.search(InputSearchParametrByAuthor());
			return true;
		case 9:
			//lib.search(InputSearchParametrByName());
			return true;
		case 10:
			new WorkWithFileLib(lib);
			return false;
		case 0:
			return false;
		default :System.out.println("err in case optnion");
			return false;
		}
		
		
	}

}
