package by.htp.catalog.service;

import by.htp.catalog.domain.entity.Book;
import by.htp.catalog.domain.vo.Catalog;

public interface CatalogService {

	Catalog getCatalog();
	Book getBook(int id);
	Book getBook(String title);
	void addBook(String title,int pages);
	void removeBook(int id);
	void removeBooks(int... id);

}
