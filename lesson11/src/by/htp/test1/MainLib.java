package by.htp.test1;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import by.htp.test1.author.Author;
import by.htp.test1.library.Library;
import by.htp.test1.library.WorkWithFileLib;
import by.htp.test1.menu.Menu;
import by.htp.test1.paper.Paper;
import by.htp.test1.paper.products.Book;
import by.htp.test1.paper.products.Magazine;

public class MainLib {

	public static void main(String[] args) throws IOException {
		Author a1=new Author("Рей", "Брэдбери");
		Author a2=new Author("Джордж", "Оруэлл",new GregorianCalendar(1903,	Calendar.JUNE, 25));
		//Author a3=new Author("Эрих Мария", "Ремарк",new GregorianCalendar(1898,	Calendar.JUNE, 22));
		Author a4=new Author("Оскар", "Уайльд",new GregorianCalendar(1854,	Calendar.OCTOBER, 16));
	
		Paper book1=new Book("481",a1,1925);
		Paper book2=new Book("1984",a2,1949);
		Paper book3=new Book("скотный двор",a2,1945);
		Paper book4=new Book("tales",a4,1910);
		Paper book5=new Book("tales",1910);
		//((Book)book5).setAuthor();
//		System.out.println(book5);
		Paper mag1 = new Magazine("Billboard",2001,1);
		Paper mag2 = new Magazine("Billboard",2002,2);
		Paper mag3 = new Magazine("Billboard",2004,4);
		Paper mag4 = new Magazine("Billboard",2003,3);
		
		Library lib= new Library("my libbbb");
		lib.add(book1);
		lib.add(book2);
		lib.add(book3);
		lib.add(book4);
		lib.add(mag1);
		lib.add(mag2);
		lib.add(mag3);
		lib.add(mag4);
		
		
		
		
//	for( Paper each:lib.search("Billboard")){
//		System.out.println(each);
//	}
//	
//	
//	for( Paper each:lib.search("Джордж Оруэлл")){
//		System.out.println(each);
//	}
//		
	
	
	
	Library lib2= new Library();
	lib2.add(book1);
	lib2.add(book2);
	lib2.add(book3);
	lib2.add(book4);
	lib2.delByIndex(0);
	
//System.out.println(LibraryArray.showLibs());
//System.out.println(LibraryArray.chooseLib().show());

	
	new Menu();
	
	
	
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////////TEST ZONE/////////////////////////////////////
	
	
	// WorkWithFileLib wwf=new  WorkWithFileLib();
	
	
	
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////
	///////////////////////////////END TEST ZONE/////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
