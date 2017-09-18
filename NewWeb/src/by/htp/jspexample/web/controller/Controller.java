package by.htp.jspexample.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.jspexample.web.Action;
import by.htp.jspexample.web.ActionCommand;
import by.htp.jspexample.web.CommandChooser;


public class Controller extends HttpServlet {

	

	private static final long serialVersionUID = 1L;

	

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("service mthd" );
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy mthd" );
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init mthd" );

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		processRequest(request,response);
//		ActionType action = ActionType.valueOf(command.toUpperCase());
//		BasicAction basicAction = CommandChooser.performAction(action);
//		basicAction.executeAction(request, response);

	}

	
	private void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String page="/jsp/error.jsp";
		String command = request.getParameter("command");
		
		Action action =Action.valueOf(command.toUpperCase());
		ActionCommand actionCommand =CommandChooser.choose(action);
		page=actionCommand.execute(request,response);
		
		if(!page.equals( "/jsp/error.jsp")){
			checkSession(request,response);
		}
		
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
		
	}
	
	private static void checkSession(HttpServletRequest request,HttpServletResponse response){
		
		HttpSession session = request.getSession(true);
		String login = request.getParameter("user_name");
		String password = request.getParameter("password");
		session.setAttribute("login", login);
		session.setAttribute("password", password);
	}

}
