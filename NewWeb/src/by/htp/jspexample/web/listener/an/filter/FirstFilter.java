package by.htp.jspexample.web.listener.an.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
//@WebInitParam(name="encoding",value="UTF-8",description="Encoding Param")
public class FirstFilter implements Filter {

	private String code;
	public FirstFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		String codeRequest=arg0.getCharacterEncoding();
		

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
		code= filterConfig.getInitParameter("encoding");
		
		
	}

}
