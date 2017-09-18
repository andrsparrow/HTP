package by.htp.bookstore.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import by.htp.bookstore.dao.factory.DaoFactory;
import by.htp.bookstore.domain.entity.Book;

public class BookDaoTest {

//	private BookDao dao = new BookMySQLImpl(); 
	private static BookDao dao ;
	
	@BeforeClass
	public static void initTestData(){
		 dao = DaoFactory.getDaoImpl("dom");
	}
	
	
	@Test
	public void testReadBooksNullList() {
		List<Book> books= dao.readBooks();
		assertNotNull(books);
	}

	
	@Test
	public void testReadBooksEmptyList() {
		List<Book> books= dao.readBooks();
		assertTrue(books.size()>0);
	}
	
	
	
}
