package by.htp.test1.paper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Paper {
	private String name;
//	private int publishYear;
	private GregorianCalendar publishDate;
	

	public Paper(String name, String publishYear) {
		super();
		if(name!=null&&publishYear !=null){
			this.name = name;
			this.publishDate =new GregorianCalendar(Integer.parseInt(publishYear),Calendar.JANUARY, 1);
		}
		
	}
	
	
	
	public Paper() {
		inputNameAndYear();
	}
	
	public void inputNameAndYear() {
		try{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("введите название издания :");
			this.name=bf.readLine();
			System.out.println("введите год публикации: ");
			String temp=bf.readLine();
			while(!isNumber(temp)){
				System.out.println("error input\ntry again");
				temp=bf.readLine();
			}
			
			int year=Integer.parseInt(temp);
			
			 publishDate = new GregorianCalendar(year,Calendar.JANUARY, 1);
			
			
		}
		catch( Exception e){
			System.out.println(e.getMessage()+"paper input");
		}
		
	}
	
	public static boolean isNumber(String year){
		  if (year == null || year.isEmpty()) return false;
		    for (int i = 0; i < year.length(); i++) {
		        if (!Character.isDigit(year.charAt(i))) return false;
		    }
		    return true;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPublishDate(GregorianCalendar publishDate) {
		this.publishDate = publishDate;
	}



	public GregorianCalendar getPublishDate() {
		return publishDate;
	}


	public String toString() {
		if(publishDate!=null){
			return " name=" + name + ", publishYear=" + publishDate.get(Calendar.YEAR) ;
		}else{
			return " name=" + name + ", publishYear= no info\t";
		}
	}
}
