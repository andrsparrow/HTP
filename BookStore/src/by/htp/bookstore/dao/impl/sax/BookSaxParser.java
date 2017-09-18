package by.htp.bookstore.dao.impl.sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoExeption;
import by.htp.bookstore.domain.entity.Book;

public class BookSaxParser implements BookDao {

	public BookSaxParser() {
		
	}

	@Override
	public List<Book> readBooks() {
		//implement SAX parser here
		List<Book> books= new ArrayList<Book>();
		
		try {
			XMLReader reader= XMLReaderFactory.createXMLReader();
			BookHandler handler= new  BookHandler();
			reader.setContentHandler(handler);
			
			reader.parse("xmldocs/books.xml");
			books=handler.getBookList();
			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return books;
	}

	@Override
	public Book readBook(int id) throws DaoExeption {
		// not to impl
		return null;
	}

	@Override
	public void deleteBook(int id) throws DaoExeption {
		// not to impl

		
	}

	@Override
	public void addBook(Book book) throws DaoExeption {
		// not to impl

		
	}

	@Override
	public void updateBook(Book book) throws DaoExeption {
		// not to impl

	}

}
