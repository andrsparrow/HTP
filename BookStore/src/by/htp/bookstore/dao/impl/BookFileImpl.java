package by.htp.bookstore.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.domain.entity.Book;

public class BookFileImpl implements BookDao {

	public BookFileImpl()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Book> readBooks() {
		List<Book> books= new ArrayList<Book>();
		
	     File f = new File("data/books.txt");
	     BufferedReader fin;
		try {
			fin = new BufferedReader(new FileReader(f));
		
	     String line;
	     while ((line = fin.readLine()) != null){
	    	 String[] s = line.split(" ");
	    	
	    	 books.add(new Book(
	    			 Integer.parseInt(s[0]),s[1],Integer.parseInt(s[2])
	    			 )          );
//	    	 System.out.println(line);
	     }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public Book readBook(int id) {
	//	throw new OperationNotSupportedException();
		return null;
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		
	}

}
