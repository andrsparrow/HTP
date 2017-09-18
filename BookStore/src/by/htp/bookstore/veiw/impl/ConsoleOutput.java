package by.htp.bookstore.veiw.impl;

import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.veiw.SimpleUserOutputer;

public class ConsoleOutput implements SimpleUserOutputer {

	public ConsoleOutput() {
		
	}

	@Override
	public void printBookCatalog(Catalog books) {
		if(books!=null){
			System.out.println("Catalog title: "+ books.getTitle());
			System.out.println("Catalog crarion date: "+books.getDateCreation());
			
			if(books.getBooks()!=null){
				for(Book book:books.getBooks()){
					System.out.println(book);
				}
			}
		}
	}
	
	
	
	
	
}
