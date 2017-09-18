package by.htp.test1.library;

import java.util.Calendar;

import by.htp.test1.author.Author;
import by.htp.test1.paper.Paper;
import by.htp.test1.paper.products.Book;
import by.htp.test1.paper.products.Magazine;

public class Library {
	
	public static Author[] authors;
	private String libName = "my lib";
	private Paper[] papers;
	

	
		
	
	

	public Library(String libName) {
		this.libName = libName;
		LibraryArray.addLib(this);
	}

	public Library(Paper... args) {
		this.papers = new Paper[args.length];
		for (int i = 0; i < args.length; i++) {
			this.papers[i] = args[i];
		}
		LibraryArray.addLib(this);
	}

	public Library(Paper paper) {
		this.papers = new Paper[1];
		this.papers[0] = paper;
		LibraryArray.addLib(this);
	}
	
	public String getLibName() {
		return libName;
	}
	
	
	
	
	

	public void add(Paper paper) {
		if(paper ==null) return;
		if(this.papers==null) {
			this.papers = new Paper[1];
			this.papers[0] = paper;
			
			return;
		}
		Paper[] temp = new Paper[this.papers.length + 1];
		for (int i = 0; i < this.papers.length; i++) {
			temp[i] = this.papers[i];
		}
		temp[temp.length - 1] = paper;
		this.papers = new Paper[temp.length];
		for (int i = 0; i < temp.length; i++) {
			this.papers[i] = temp[i];
		}
	}

	public String show() {
		
		String temp = "Libarary(" + libName ;
		if(papers==null)return temp+")"+" is empty";
		
		temp+=",(" + papers.length
				+ ") consists of: \n\t";
		
		for (int i = 0; i < papers.length; i++) {
			temp += papers[i] + "\n\t";
		}
		return temp;
	}

	public boolean deletePaper(int numberOfMagazine) {
		for (int i = 0; i < papers.length; i++) {
			String temp = papers[i].getClass().getSimpleName();
			if (temp.equals("Magazine")) {
				if (((Magazine) papers[i]).getNumber() == numberOfMagazine)
					delByIndex(i);
				return true;
			}
		}
		return false;
	}

	public boolean deletePaper(String bookName) {
		for (int i = 0; i < papers.length; i++) {
			String temp = papers[i].getClass().getSimpleName();
			if (temp.equals("Book")&&bookName.equals(papers[i].getName())) {
				//System.out.println(i);
				delByIndex(i);
				return true;
			}
			
		}
		return false;
	}
	
	public void sortingByYear() {

		for (int i = 0; i < papers.length; i++) {
			for (int j = i + 1; j < papers.length; j++) {
				if (papers[j].getPublishDate().get(Calendar.YEAR) > papers[i].getPublishDate().get(Calendar.YEAR)) {
					Paper temp = papers[j];
					papers[j] = papers[i];
					papers[i] = temp;
				}
			}
		}

	}

	public void sortingByNumber() {

		for (int i = 0; i < papers.length; i++) {
			for (int j = i + 1; j < papers.length; j++) {
				String temp = papers[i].getClass().getSimpleName();
				if (temp.equals("Magazine")) {
					Paper te = papers[j];
					papers[j] = papers[i];
					papers[i] = te;
				}
			
			}
		}

		for (int i = 0; i < papers.length; i++) {
			for (int j = i + 1; j < papers.length; j++) {
				String temp = papers[i].getClass().getSimpleName();
				if (temp.equals("Magazine")) {

					if (((Magazine) papers[i]).getNumber() > ((Magazine) papers[j]).getNumber()) {
						Paper te = papers[j];
						papers[j] = papers[i];
						papers[i] = te;
					}
				}

			}
		}

	}

	public Paper[] search(String MagazinNameOrBookAuthor){
		Paper []result=null;
		for (int i = 0; i < papers.length; i++) {
			String temp = papers[i].getClass().getSimpleName();
			if (temp.equals("Magazine")) {
				if (((Magazine) papers[i]).getName().equalsIgnoreCase(MagazinNameOrBookAuthor)){
					result=adding(result,papers[i]);
				}
					
			}
			if(temp.equals("Book")){
				if (((Book) papers[i]).getAuthor().equalsIgnoreCase(MagazinNameOrBookAuthor)){
					result=adding(result,papers[i]);
				}
					
			}
		}
		
		return result;
		
	}
	
	public Paper[] search(){
		
	
		Paper[] result=new Paper[0];
		for (int i = 0; i < papers.length; i++) {
			String temp = papers[i].getClass().getSimpleName();
			if (temp.equals("Magazine")) {
				if (((Magazine) papers[i]).getNumber() == 1)
					adding(result,papers[i]);
			}
		}
		
		return result;
		
	}
	
	
	
	
	
	public void delByIndex(int index) {
		if(index>=this.papers.length){
			System.out.println("err in del method");
			return;
		}
		Paper[] temp = new Paper[this.papers.length - 1];

		for (int i = 0; i < index; i++) {
			temp[i] = papers[i];
		}

		for (int i = index + 1; i < papers.length; i++) {
			temp[i - 1] = papers[i];
		}

		this.papers = new Paper[temp.length];
		for (int i = 0; i < temp.length; i++) {
			this.papers[i] = temp[i];
		}

	}

	private Paper[] adding(Paper [] arr,Paper paper){
		if(paper ==null) return null;
		if(arr==null) {
			arr = new Paper[1];
			arr[0] = paper;
			return arr;
		}
		
		Paper[] temp = new Paper[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[temp.length - 1] = paper;
		arr = new Paper[temp.length];
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		return arr;
		
		
		
	}
	
	
}
