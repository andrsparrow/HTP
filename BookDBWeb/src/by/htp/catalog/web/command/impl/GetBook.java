package by.htp.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.catalog.web.command.BasicAction;

public class GetBook implements BasicAction {

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE HTML>" + "<html><body>id" + "<form action = 'MainServlet' method='GET'>"
				+ "<input type = 'text' name='book_id'/>"
				+ "<input type = 'hidden' name='command' value='view_book_action'/>"
				+ "<input type = 'submit' value = 'view'/>" + "</form>" + "</body></html>");

		return null;
	}

}
