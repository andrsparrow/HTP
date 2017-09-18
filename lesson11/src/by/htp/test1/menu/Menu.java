package  by.htp.test1.menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import by.htp.test1.library.LibraryArray;
import by.htp.test1.library.WorkWithLib;
import by.htp.test1.paper.Paper;

public class Menu {

	private BufferedReader bf 
		= new BufferedReader(new InputStreamReader(System.in));

	public Menu() {
		startMenu();
	}

	public void startMenu() {

		try {
			
			System.out.println("Выберете опцию :");
			System.out.println("1-создать библиотеку");
			System.out.println("2-выбрать библиотеку");
			System.out.println("q-выход");
			String temp = bf.readLine();

			if (temp.equalsIgnoreCase("q"))
				return;
			while (!Paper.isNumber(temp)) {
				System.out.println("error input(not number)\ntry again1");
				temp = bf.readLine();

			}

			WorkWithLib wwl=null;
			switch (temp) {
			case "1":
				wwl = new WorkWithLib();
				wwl.workWithOptions(chooseLibOptions());
				break;
			case "2":

				wwl = new WorkWithLib(LibraryArray.chooseLib());
				// wwl.workWithOptions(chooseLibOptions());
				// System.out.println(chooseLibOptions());
				break;
			default:
				System.out.println("error in case wwl");
			}
		
			while(wwl.workWithOptions(chooseLibOptions())){	}
			
		}

		catch (Exception e) {
			System.out.println(e + " statr menu err");
		}
	}

	public int chooseLibOptions() {

		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.println("выберете опцию:");
			System.out.println("1-посмотреть библиотеку");
			System.out.println("2-добавить книгу ");
			System.out.println("3-удалить книгу ");
			System.out.println("4-добавить журнал ");
			System.out.println("5-удалить журнал ");
			System.out.println("6-отсортировать журналы по номерам журналов ");
			System.out.println("7-отсортировать книги по дате публикации ");
			System.out.println("8- поиск книги по автору ");
			System.out.println("9- поиск журнала по названию");
			System.out.println("10- работа с файлами");
			System.out.println("q-выход");
			String temp = bf.readLine();
			
			if(temp.equalsIgnoreCase("q"))return 0;
			
			 while(!Paper.isNumber(temp)||temp.equalsIgnoreCase("q")){
				 System.out.println("error input\ntry again");
				 temp=bf.readLine();
			 }
			 
			 while(Integer.parseInt(temp)<=0 | Integer.parseInt(temp)>10){
				 System.out.println("error input\ntry again ");
				 temp=bf.readLine();
			 }
			 
			 
			 
			 return Integer.parseInt(temp);
			
		} catch (Exception e) {

			System.out.println(e + " choose optn err");
			return 0;
		}

	}

	
	
	
}
