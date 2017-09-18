package by.htp.test1.paper.products;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import by.htp.test1.author.Author;
import by.htp.test1.paper.Paper;

public class Book extends Paper{
	private Author author;
	
	
	
	public Book(String name,Author author,int publishYear){
		
	//	if(name!=null&&author)
		super(name,publishYear+"");
		this.author=author;
	}
	
	public Book(String name,int publishYear){
		
		super(name,publishYear+"");
		this.author=new Author();
	}
	
	
	
	public Book(){
		super();
		this.author=new Author();
	}

	public void setAuthor(){
		System.out.println("введите выбирете автора :");
		System.out.println(Author.ShowAuthors());
		try{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String temp=bf.readLine();
			while(!Paper.isNumber(temp)){
				System.out.println("please choose authors' index");
				 temp=bf.readLine();
			}
			this.author=Author.getAuthor(Integer.parseInt(temp));
			
			
			
		}
		catch( Exception e){
			System.out.println(e.getMessage()+"paper input");
		}
		
		
	}
	
	
	
	
	public String getAuthor() {
		return author.getName()+" "+author.getSurname();
	}

	@Override
	public String toString() {
	
		return "Book [" +super.toString()+ ", "+"author= " +author.getSurname()+" "+author.getName()+"]";
	}


	
}
