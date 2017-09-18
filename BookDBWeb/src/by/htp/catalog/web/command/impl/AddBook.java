package by.htp.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.catalog.web.command.BasicAction;

public class AddBook implements BasicAction {



	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out= response.getWriter();
		out.println("<!DOCTYPE HTML>" + "<html><body>" + "<form action = 'MainServlet' method='GET'>"
				+ "<p>title<input type = 'text' name='book_title'/></p>"
				+ "<p>pages<input type = 'text' name='book_pages'/></p>"
				+ "<input type = 'hidden' name='command' value='add_book_action'/>"
				+ "<input type = 'submit' value = 'add'/>" + "</form>" + "</body></html>");
		
		
		return null;
	}

}
