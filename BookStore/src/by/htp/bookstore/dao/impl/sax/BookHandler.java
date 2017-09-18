package by.htp.bookstore.dao.impl.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.bookstore.domain.BookElement;
import by.htp.bookstore.domain.entity.Book;

public class BookHandler extends DefaultHandler {
	
	private List<Book> bookList= new ArrayList<Book>();
	private Book book;
	private StringBuilder text;
	

	@Override
	public void startDocument() throws SAXException {
//			System.out.println("sax parser found root element");
			
	}

	@Override
	public void endDocument() throws SAXException {
//		System.out.println("sax parser ended");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
//		BookElement currentElement= BookElement.valueOf(qName.toUpperCase());
//		switch(currentElement){
//		case BOOK:
//			System.out.println(qName);
//			break;
//		case PAGES:
//			System.out.println(qName);
//			break;
//		case TITLE:
//			System.out.println(qName);
//			break;
//		}
		
		
		
		text= new StringBuilder();
		if(qName.equals("book")){
			book= new Book();
			book.setId((Integer.parseInt(attributes.getValue("id"))));
		}
		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		BookElement currentElement= BookElement.valueOf(qName.toUpperCase());
		switch(currentElement){
		case TITLE:
			book.setTitle(text.toString());
			break;
		case PAGES:
			book.setPageCount(Integer.parseInt(text.toString()));
			break;
		case BOOK:
			bookList.add(book);
			book=null;
			break;
		}
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		text.append(ch,start,length);
	}
	
	public List<Book> getBookList(){
		return bookList;
	}

	public BookHandler() {
		
	}

}
