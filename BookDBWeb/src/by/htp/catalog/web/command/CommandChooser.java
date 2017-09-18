package by.htp.catalog.web.command;

import by.htp.catalog.web.command.impl.AddBook;
import by.htp.catalog.web.command.impl.AddBookAction;
import by.htp.catalog.web.command.impl.DeleteBook;
import by.htp.catalog.web.command.impl.DeleteBookAction;
import by.htp.catalog.web.command.impl.DeleteBooks;
import by.htp.catalog.web.command.impl.DeleteBooksAction;
import by.htp.catalog.web.command.impl.GetBook;
import by.htp.catalog.web.command.impl.VeiwBook;
import by.htp.catalog.web.command.impl.VeiwBookList;

public class CommandChooser {

	public static BasicAction performAction(ActionType action) {
		
		BasicAction basicAction = null;
		switch(action){
		case ADD_BOOK:
			basicAction= new AddBook();
			break;
		case ADD_BOOK_ACTION:
			basicAction= new AddBookAction();
			break;
		case DELETE_BOOK:
			basicAction= new DeleteBook();
			break;
		case DELETE_BOOK_ACTION:
			basicAction= new DeleteBookAction();
			break;
		case GET_BOOK:
			basicAction = new GetBook();
			break;
		case VIEW_BOOK:
			basicAction= new VeiwBook();
			break;
		case VIEW_BOOK_ACTION:
			basicAction= new VeiwBook();
			break;
		case VIEW_BOOK_LIST:
			basicAction = new VeiwBookList();
			break;
		case DEL_BOOKS:
			basicAction = new DeleteBooks();
			break;
		case DEL_BOOKS_ACTION:
			basicAction = new DeleteBooksAction();
			break;
		}
		return basicAction;
	}

}
