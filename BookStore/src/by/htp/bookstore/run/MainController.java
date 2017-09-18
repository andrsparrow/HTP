package by.htp.bookstore.run;

import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.service.BookService;
import by.htp.bookstore.service.impl.BookLServiceImpl;
import by.htp.bookstore.veiw.SimpleUserOutputer;
import by.htp.bookstore.veiw.impl.ConsoleOutput;

public class MainController {

	public static void main(String[] args) {
		
		BookService bookService = new BookLServiceImpl();
		SimpleUserOutputer outputer= new ConsoleOutput();
		
		Catalog books= bookService.getBookCatalog();
		outputer.printBookCatalog(books);

//		Book book = new Book(10, "123", 123);
//		bookService.addNewBook(book);
	
		
//		books= bookService.getBookCatalog();
//		outputer.printBookCatalog(books);
		
//		Book b1=bookService.getBook(3);
//		System.out.println(b1);
		
//		bookService.deleteBook(21);
//		books= bookService.getBookCatalog();
//		outputer.printBookCatalog(books);
		
//		Book b1=bookService.getBook(3);
//		b1.setTitle(b1.getTitle()+"LLL");
//		bookService.updateBook(b1);
//		books= bookService.getBookCatalog();
//		outputer.printBookCatalog(books);
		
		
	}

}
