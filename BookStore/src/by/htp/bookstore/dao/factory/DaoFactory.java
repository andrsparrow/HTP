package by.htp.bookstore.dao.factory;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.impl.BookFileImpl;
import by.htp.bookstore.dao.impl.BookMySQLImpl;
import by.htp.bookstore.dao.impl.Stax.BookStaxParser;
import by.htp.bookstore.dao.impl.dom.BookDomParser;
import by.htp.bookstore.dao.impl.sax.BookSaxParser;

public class DaoFactory {

	public static BookDao getDaoImpl(String daoNameImpl){

		if("MySQL".equalsIgnoreCase(daoNameImpl)){
			return  new BookMySQLImpl();
		}else if("File".equalsIgnoreCase(daoNameImpl)){
			return  new BookFileImpl();
		}else if("sax".equalsIgnoreCase(daoNameImpl)){
			return  new BookSaxParser();
		}else if("stax".equalsIgnoreCase(daoNameImpl)){
			return  new BookStaxParser();
		}else if("dom".equalsIgnoreCase(daoNameImpl)){
			return  new BookDomParser();
		}else{
			throw new IllegalArgumentException("Bad value: "+ daoNameImpl);
		}
	}
}
