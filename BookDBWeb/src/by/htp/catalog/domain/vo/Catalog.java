package by.htp.catalog.domain.vo;

import java.io.Serializable;
import java.util.List;

import by.htp.catalog.domain.entity.Book;

public class Catalog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2466582512710106263L;
	private String title;
	private List<Book> books;

	public Catalog() {

	}
	public int size(){
		return books.size();
	}

	public Catalog(String title, List<Book> books) {
		super();
		this.title = title;
		this.books = books;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalog other = (Catalog) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	
	
	

	
}
