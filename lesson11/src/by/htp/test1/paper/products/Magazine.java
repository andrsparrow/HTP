package by.htp.test1.paper.products;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import by.htp.test1.paper.Paper;

public class Magazine extends Paper {

	private int number;
	
	public Magazine(String name, int publishYear) {
		super(name, publishYear+"");
	}
	
	public Magazine(String name, int publishYear,int number) {
		super(name, publishYear+"");
		this.number=number;
		
	}
	
	
	public Magazine() {
		super();
		this.number=inputNumberOfMagazine();
		
	}
	
	private int inputNumberOfMagazine(){
		try{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("введите номер издания :");
			String temp=bf.readLine();
			while(!isNumber(temp)){
				System.out.println("error input\ntry again");
				temp=bf.readLine();
			}
			
			return Integer.parseInt(temp);
		}
		catch( Exception e){
			System.out.println(e.getMessage()+"\nerror in inputmagazin method");
			return 0;
		}
		
		
	}
	
	public int getNumber() {
		return number;
	}
	@Override
	public String toString() {
		return "Magazine ["+super.toString()+" ,number=" + number + "]";
	}
}
