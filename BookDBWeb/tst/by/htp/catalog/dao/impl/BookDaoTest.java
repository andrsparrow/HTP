package by.htp.catalog.dao.impl;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import by.htp.catalog.dao.BookDao;

public class BookDaoTest {

	private static BookDao dao;

	@BeforeClass
	public static void init() {
		dao = new BookDaoImpl();
	}



	@Test
	public void testreadBooksNotNull() {
		assertNotNull("books was not read", dao.readBooks());
	}

	@Test
	public void testreadBooksNotEmpy() {
		assertNotNull("impossible check emplty", dao.readBooks());
		assertTrue("books was not read", dao.readBooks().size() > 0);
	}

}
