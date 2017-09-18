package by.htp.catalog.service.impl;

import java.util.List;

import by.htp.catalog.dao.BookDao;
import by.htp.catalog.dao.DaoExeption;
import by.htp.catalog.dao.impl.BookDaoImpl;
import by.htp.catalog.domain.entity.Book;
import by.htp.catalog.domain.vo.Catalog;
import by.htp.catalog.service.CatalogService;

public class SimpleCatalogImpl implements CatalogService {

	private BookDao dao = new BookDaoImpl();

	public SimpleCatalogImpl() {

	}

	@Override
	public Catalog getCatalog() {
		List<Book> books = dao.readBooks();
		String catalogTitle = "Daily catalog";
		Catalog catalog = new Catalog();
		catalog.setTitle(catalogTitle);
		catalog.setBooks(books);
		return catalog;
	}

	@Override
	public Book getBook(int id) {
		Book book = null;
		try {
			book = dao.readBook(id);
		} catch (DaoExeption e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public Book getBook(String title) {
		Book book = null;
		try {
			book = dao.readBook(title);
		} catch (DaoExeption e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public void addBook(String title, int pages) {
		if (title != null && pages > 0) {
			try {
				dao.addBook(title, pages);
			} catch (DaoExeption e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void removeBook(int id) {
		if (id > 0) {
			try {
				dao.deleteBook(id);
			} catch (DaoExeption e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void removeBooks(int... id) {
		try {
			dao.deleteBooks(id);
		} catch (DaoExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
