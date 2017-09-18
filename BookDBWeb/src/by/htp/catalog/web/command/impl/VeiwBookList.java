package by.htp.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.catalog.domain.entity.Book;
import by.htp.catalog.domain.vo.Catalog;
import by.htp.catalog.service.CatalogService;
import by.htp.catalog.service.impl.SimpleCatalogImpl;
import by.htp.catalog.web.command.BasicAction;

public class VeiwBookList implements BasicAction{

	private CatalogService service = new SimpleCatalogImpl();
	

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out= response.getWriter();
		
//		Catalog catalog = service.getCatalog();
//		for(Book book:catalog.getBooks()){
//			out.println(book);
//		}
		
		//////////////////////////
		out.println(
				"<!DOCTYPE HTML>" 
						+ "<html><body>"
						+ "<ul>"
				);
		Catalog catalog = service.getCatalog();
		for (Book book : catalog.getBooks()) {
			out.println(
					 "<li><a href='/BookDBWeb/MainServlet?command=view_book&book_id="+book.getId()+"'>"+book.getTitle()+"</a></li>"	
					);
		}
		out.println( "</ul>"
						+  "</body>"
						+ "</html>"
		);
		
		
		return null;
	}

}
