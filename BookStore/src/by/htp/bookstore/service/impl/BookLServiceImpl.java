package by.htp.bookstore.service.impl;

import java.util.Date;
import java.util.List;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoExeption;
import by.htp.bookstore.dao.factory.DaoFactory;
import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.service.BookService;

public class BookLServiceImpl implements BookService {

	// change to factory
//	private BookDao dao = new BookMySQLImpl();

	 private BookDao dao= DaoFactory.getDaoImpl("dom");

	public BookLServiceImpl() {

	}

	@Override
	public Catalog getBookCatalog() {

		List<Book> books = dao.readBooks();
		String catalogTitle = "Daily catalog";
		Date dateCreation = new Date();
		Catalog catalog = new Catalog(catalogTitle, dateCreation);
		catalog.setBooks(books);
		return catalog;
	}

	@Override
	public void addNewBook(Book book) {
		if (book != null) {
			try {
				dao.addBook(book);
			} catch (DaoExeption e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Book getBook(int id) {
		Book book=null;
		if (id > 0) {
			try {
				book= dao.readBook(id);
			} catch (DaoExeption e) {
				e.printStackTrace();
			}
		}
		return book;
	}

	
	@Override
	public void deleteBook(int id) {
		
		if(id>0){
			try {
				dao.deleteBook(id);
			} catch (DaoExeption e) {
				e.printStackTrace();
			}
		}
	}

	
	@Override
	public void updateBook(Book book) {
		if(book!=null){
			try {
				dao.updateBook(book);
			} catch (DaoExeption e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
