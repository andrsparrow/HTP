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

public class DeleteBooks implements BasicAction {

	public DeleteBooks() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 CatalogService service = new SimpleCatalogImpl();
		PrintWriter out = response.getWriter();
		out.println(
				"<!DOCTYPE HTML>" 
						+ "<html><body>"
						+ "<form action = 'MainServlet' method='GET'>"
				
				);
		Catalog catalog = service.getCatalog();
		for (Book book : catalog.getBooks()) {
			out.println(
					"<input id ='"+book.getId()+"' type = 'checkbox' name='book"+book.getId()+"'/>"
							+ "<label for='"+book.getId()+"' title='pages:"+book.getPages()+"' >"+book.getTitle()+"</label><br>"	
					);
		}
		
		out.println("<input type = 'hidden' name='command' value='del_books_action'/>"
				+ "<input type='submit' value='del' />"
						+ "</form>"
						+  "</body>"
						+ "</html>"
		);
		

	
		return null;
	}

}
