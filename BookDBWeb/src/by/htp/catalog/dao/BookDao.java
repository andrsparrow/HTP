package by.htp.catalog.dao;

import java.util.List;

import by.htp.catalog.domain.entity.Book;

public interface BookDao {

	List<Book> readBooks();
	Book readBook(int id) throws DaoExeption;
	Book readBook(String title) throws DaoExeption;
	void addBook(String title,int pages) throws DaoExeption;
	void deleteBook(int id) throws DaoExeption;
	void deleteBooks(int...id ) throws DaoExeption;
}
