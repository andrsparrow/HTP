package by.htp.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.catalog.service.CatalogService;
import by.htp.catalog.service.impl.SimpleCatalogImpl;
import by.htp.catalog.web.command.BasicAction;

public class AddBookAction implements BasicAction {

	private CatalogService service = new SimpleCatalogImpl();
	
	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		String title = request.getParameter("book_title");
		int pages = Integer.parseInt(request.getParameter("book_pages"));
		
		service.addBook(title, pages);
		out.println("book added");
		return null;
	}

}
