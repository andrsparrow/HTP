package by.htp.jspexample.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ActionCommand {
	String execute(HttpServletRequest request,HttpServletResponse responce);

}
