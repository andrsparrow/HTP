package by.htp.bookstore.dao;

import java.util.List;

import by.htp.bookstore.domain.entity.Book;

public interface BookDao {
	List<Book> readBooks();
	
	Book readBook(int id) throws DaoExeption;
	
	void deleteBook(int id) throws DaoExeption;
	
	void addBook(Book book) throws DaoExeption;
	
	void updateBook(Book book) throws DaoExeption;

}
