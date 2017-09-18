package by.htp.bookstore.dao.impl.dom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoExeption;
import by.htp.bookstore.domain.entity.Book;

public class BookDomParser implements BookDao {

	public BookDomParser() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Book> readBooks() {

		DOMParser parser = new DOMParser();
		List<Book> bookList = new ArrayList<Book>();
		try {
			parser.parse("xmldocs/books.xml");
			Document document = parser.getDocument();
			Element root = document.getDocumentElement();

			NodeList books = root.getElementsByTagName("book");
			Book book = null;
			for (int i = 0; i < books.getLength(); i++) {
				book = new Book();
				Element elementBook = (Element) books.item(i);
				book.setId(Integer.parseInt(elementBook.getAttribute("id")));
				book.setTitle(getSingleChild(elementBook, "title").getTextContent().trim());
				book.setPageCount((Integer.parseInt(getSingleChild(elementBook, "pages").getTextContent())));
				bookList.add(book);
			}

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bookList;
	}

	private static Element getSingleChild(Element element, String childName) {
		NodeList nlist = element.getElementsByTagName(childName);
		Element child = (Element) nlist.item(0);
		return child;
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
