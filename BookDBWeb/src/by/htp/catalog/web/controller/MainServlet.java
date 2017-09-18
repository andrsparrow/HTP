package by.htp.catalog.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.catalog.service.CatalogService;
import by.htp.catalog.service.impl.SimpleCatalogImpl;
import by.htp.catalog.web.command.ActionType;
import by.htp.catalog.web.command.BasicAction;
import by.htp.catalog.web.command.CommandChooser;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int requestCount = 0;
	private CatalogService service;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("service mthd" + requestCount);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy mthd" + requestCount);
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init mthd" + requestCount);
		service = new SimpleCatalogImpl();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		requestCount++;
		String command = request.getParameter("command");
		if(command.equals("add_book")){
			
			request.getRequestDispatcher("addBook.jsp").forward(request	, response);
			
		}
//		ActionType action = ActionType.valueOf(command.toUpperCase());
//		BasicAction basicAction = CommandChooser.performAction(action);
//		basicAction.executeAction(request, response);

	}

}
