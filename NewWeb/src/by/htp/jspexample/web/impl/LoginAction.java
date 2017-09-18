package by.htp.jspexample.web.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.jspexample.web.ActionCommand;
import by.htp.jspexample.web.logic.LoginLogic;

public class LoginAction implements ActionCommand {


	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response ) {
		String login = request.getParameter("user_name");
		String password = request.getParameter("password");
		String page = LoginLogic.CheckLogin(login, password);
		
		return page;
	}

}
