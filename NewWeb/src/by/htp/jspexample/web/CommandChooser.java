package by.htp.jspexample.web;

import by.htp.jspexample.web.impl.LoginAction;

public class CommandChooser {

	public CommandChooser() {
		// TODO Auto-generated constructor stub
	}
	
	public static ActionCommand choose(Action command){
		
		ActionCommand action=null;
		switch(command){
		case LOGIN:
			action=new LoginAction();
			break;
		case LOGOUT:
//			action=new LoginAction();
			break;
		}
		return action;
	}
	

}
