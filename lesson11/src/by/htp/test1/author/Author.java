package by.htp.test1.author;

import java.util.Calendar;
import java.util.GregorianCalendar;

import by.htp.test1.paper.products.Book;

public class Author {

	private String name;
	private String surname;
	private GregorianCalendar age;
	private Book[] books;
	
	private static Author[] authors;

	static{
		addAuthor("Джордж", "Оруэлл",new GregorianCalendar(1903,	Calendar.JUNE, 25));
		addAuthor("Эрих Мария", "Ремарк",new GregorianCalendar(1898,	Calendar.JUNE, 22));
		addAuthor("Оскар", "Уайльд",new GregorianCalendar(1854,	Calendar.OCTOBER, 16));
		addAuthor("Рей", "Брэдбери");
		
		
//		Author a1=new Author("Рей", "Брэдбери");
//		Author a2=new Author("Джордж", "Оруэлл",new GregorianCalendar(1903,	Calendar.JUNE, 25));
//		Author a3=new Author("Эрих Мария", "Ремарк",new GregorianCalendar(1898,	Calendar.JUNE, 22));
//		Author a4=new Author("Оскар", "Уайльд",new GregorianCalendar(1854,	Calendar.OCTOBER, 16));
	
	}
	private static void addAuthor(String name, String surname, GregorianCalendar age){

		if(name ==null) return;
		if(surname ==null) return;
		if(authors==null) {
			authors = new Author[1];
			authors[0] = new Author(name,surname,age);
			return;
		}
		Author[] temp = new Author[authors.length + 1];
		for (int i = 0; i < authors.length; i++) {
			temp[i] = authors[i];
		}
		temp[temp.length - 1] = new Author(name,surname,age);
		authors = new Author[temp.length];
		for (int i = 0; i < temp.length; i++) {
			authors[i] = temp[i];
		}
	
		
	}
	
	private static void addAuthor(String name, String surname){

		if(name ==null) return;
		if(surname ==null) return;
		if(authors==null) {
			authors = new Author[1];
			authors[0] = new Author(name,surname);
			return;
		}
		Author[] temp = new Author[authors.length + 1];
		for (int i = 0; i < authors.length; i++) {
			temp[i] = authors[i];
		}
		temp[temp.length - 1] = new Author(name,surname);
		authors = new Author[temp.length];
		for (int i = 0; i < temp.length; i++) {
			authors[i] = temp[i];
		}
	
		
	}
	
	public static String ShowAuthors(){

		int index=0;
		String temp="";
		for(Author each:authors){
			temp+=index +")"+each+"\n";
			index++;
		}
		
		return temp;
	}
	
	public static Author getAuthor(int index){
		return authors[index];
	}
	

	public Author(String name, String surname, GregorianCalendar age) {

		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public Author(String name, String surname, int age) {

		this.name = name;
		this.surname = surname;
		this.age = new GregorianCalendar(age,Calendar.JANUARY, 1);
	}

	public Author(String name, String surname) {

		this.name = name;
		this.surname = surname;
		
	}
	public Author() {

		this.name = "no name";
		this.surname = "no surname";
		
	}














	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		String temp= "Author [name=" + name + ", surname=" + surname ;
		if(age==null){
			temp+=", age no info,";
		}else{
			temp+=", age=" + age.get(Calendar.YEAR)+"."+ age.get(Calendar.MONTH)+"."+age.get(Calendar.DAY_OF_MONTH)+ ", books=\n\t";
		}
		if(books!=null){
			for(int i=0;i<books.length;i++){
				temp+=books[i];
			}
		}
		else{
			temp+=" no book yet";
		}
		temp+="]";
		
		
		return temp;
	}
}
