package by.htp.catalog.web.command.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.catalog.domain.entity.Book;
import by.htp.catalog.domain.vo.Catalog;
import by.htp.catalog.service.CatalogService;
import by.htp.catalog.service.impl.SimpleCatalogImpl;
import by.htp.catalog.web.command.BasicAction;

public class DeleteBooksAction implements BasicAction {

	private CatalogService service = new SimpleCatalogImpl();

	@Override
	public String executeAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("the books will be deleted");

		Catalog catalog = service.getCatalog();
		ArrayList<Integer> ids= new ArrayList<Integer>();
		int count=0;
		for (Book book : catalog.getBooks()) {
			String temp = request.getParameter("book" + book.getId());
			if(temp!=null){
				ids.add(book.getId());
			}
		}
		  out.println(ids);
		 int[] ret = new int[ids.size()];
		    for (int i=0; i < ret.length; i++)
		    {
		        ret[i] = ids.get(i).intValue();
		    }
		    if(ret.length>=0)
		service.removeBooks(ret);
//		if(count==0){
//			out.println("non was choosen");
//		}
//		for(int i = 0 ; i<ids.length;i++){
//			if(ids[i]!=null){
//				out.println("lol");
//			}
//		}
		
		return null;
	}

}
