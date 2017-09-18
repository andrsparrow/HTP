package by.htp.bookstore.dao.impl.Stax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoExeption;
import by.htp.bookstore.domain.entity.Book;

public class BookStaxParser implements BookDao {

	// флаги для событий XML файла
	private static boolean titleFlag;
	private static boolean pagesFlag;

	public BookStaxParser() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Book> readBooks() {

		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		List<Book> bookList = new ArrayList<Book>();
		;

		try {
			InputStream inputstr = new FileInputStream("xmldocs/books.xml");
			XMLStreamReader reader = inputFactory.createXMLStreamReader(inputstr);
			bookList = process(reader);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}

		return bookList;
	}

	private static List<Book> process(XMLStreamReader reader) throws XMLStreamException {
		List<Book> books = new ArrayList<Book>();
		Book book = null;
		// BookElement currentElement=null;

		while (reader.hasNext()) {
			int evenType = reader.next();
			switch (evenType) {

			case XMLStreamConstants.START_DOCUMENT:
				System.out.println("started");
				break;
			case XMLStreamConstants.START_ELEMENT:
				// в зависимости от имени тега отмечаем нужный фалг
				if (reader.getLocalName().equalsIgnoreCase("book")) {
					book = new Book();
					book.setId(Integer.parseInt(reader.getAttributeValue(0)));
				} else if (reader.getLocalName().equalsIgnoreCase("title")) {
					titleFlag = true;
				} else if (reader.getLocalName().equalsIgnoreCase("pages")) {
					pagesFlag = true;
				}
				break;
			// сохраняем данные XML-элемента,
			// флаг которого равен true в объект book
			case XMLStreamConstants.CHARACTERS:
				if (titleFlag) {
					book.setTitle(reader.getText());
					titleFlag = false;
				} else if (pagesFlag) {
					book.setPageCount(Integer.parseInt(reader.getText()));
					pagesFlag = false;
				}
				break;
			// если цикл дошел до закрывающего элемента узла Student, то
			// сохраняем объект в список
			case XMLStreamConstants.END_ELEMENT:
				if (reader.getLocalName().equalsIgnoreCase("book")) {
					books.add(book);
				}
				break;
			}
		}
		return books;
	}

	@Override
	public Book readBook(int id) throws DaoExeption {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int id) throws DaoExeption {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBook(Book book) throws DaoExeption {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBook(Book book) throws DaoExeption {
		// TODO Auto-generated method stub

	}

}
