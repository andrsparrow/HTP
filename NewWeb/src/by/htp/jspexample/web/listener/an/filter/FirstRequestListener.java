package by.htp.jspexample.web.listener.an.filter;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class FirstRequestListener implements ServletRequestListener {

	public FirstRequestListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
//		ServletRequestListener.super.requestInitialized(sre);
		HttpServletRequest requset = (HttpServletRequest) sre.getServletRequest();
//		if(requset!=null)
//			if(requset.getAttribute("user_name").equals("user"))
			System.out.println(requset+"_listener");
//			requset.setAttribute("command", "user");
	}
	
	

}
