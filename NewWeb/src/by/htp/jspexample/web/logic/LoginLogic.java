package by.htp.jspexample.web.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginLogic {

	private static final String DB_URL = "jdbc:mysql://localhost/authorization?"
			+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
	private static final String DB_USR = "root";
	private static final String DB_PAS = "root";
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SQL_SELECT_BOOK = "SELECT * FROM users WHERE login=? AND password=?";

	public LoginLogic() {
		// TODO Auto-generated constructor stub
	}

	public static String CheckLogin(String login, String password) {
		String page = "/jsp/error.jsp";

		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Class.forName(DB_DRIVER);

			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);

			ps = cn.prepareStatement(SQL_SELECT_BOOK);
			ps.setString(1, login);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				int status = rs.getInt(3);
				if (status == 0)
					page = "/jsp/user.jsp";
				if (status == 1)
					page = "/jsp/admin.jsp";
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return page;
	}

}
