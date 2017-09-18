package by.htp.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.catalog.service.CatalogService;
import by.htp.catalog.service.impl.SimpleCatalogImpl;
import by.htp.catalog.web.command.BasicAction;

public class VeiwBook implements BasicAction {
	private CatalogService service = new SimpleCatalogImpl();

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out= response.getWriter();
		
		String temp = request.getParameter("book_id");
		out.println(service.getBook(Integer.parseInt(temp)));
		return null;
	}

}
