package by.htp.catalog.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.catalog.dao.AbstractDao;
import by.htp.catalog.dao.BookDao;
import by.htp.catalog.dao.DaoExeption;
import by.htp.catalog.domain.entity.Book;

public class BookDaoImpl extends AbstractDao implements BookDao {

	private static final String DB_URL = "jdbc:mysql://localhost/bookcatalog?"
			+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
	private static final String DB_USR = "root";
	private static final String DB_PAS = "root";
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SQL_SELECT_BOOKS = "SELECT * FROM book ";
	private static final String SQL_SELECT_BOOK = "SELECT * FROM book where id=? ";
	private static final String SQL_SELECT_BOOK_BY_TITLE = "SELECT * FROM book where title=? ";
	private static final String SQL_INSERT_BOOK = "INSERT INTO book (title, pages) VALUES (?, ?)";
	private static final String SQL_DELETE_BOOK = "DELETE FROM book WHERE  id=?";
	private static  String SQL_DELETE_BOOKS = "DELETE FROM book WHERE  id IN ( ";

	public BookDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Book> readBooks() {

		List<Book> books = null;

		try {
			Class.forName(DB_DRIVER);

			Connection cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_BOOKS);

			books = new ArrayList<Book>();

			while (rs.next()) {
				Book book = new Book();
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int pages = rs.getInt(3);

				book.setId(id);
				book.setTitle(title);
				book.setPages(pages);

				books.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return books;
	}

	@Override
	public Book readBook(int id) throws DaoExeption {
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Book book = null;

		try {
			Class.forName(DB_DRIVER);
			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);

			ps = cn.prepareStatement(SQL_SELECT_BOOK);
			ps.setInt(1, id);

			rs = ps.executeQuery();
			if (rs.next()) {
				book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setPages(rs.getInt("pages"));
			}

		} catch (ClassNotFoundException e) {
			throw new DaoExeption("Driver was not found", e);
		} catch (SQLException e) {
			throw new DaoExeption("Problem with reading book", e);
		}

		return book;
	}

	@Override
	public Book readBook(String title) throws DaoExeption {
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Book book = null;

		try {
			Class.forName(DB_DRIVER);
			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);

			ps = cn.prepareStatement(SQL_SELECT_BOOK_BY_TITLE);
			ps.setString(1, title);

			rs = ps.executeQuery();
			if (rs.next()) {
				book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setPages(rs.getInt("pages"));
			}

		} catch (ClassNotFoundException e) {
			throw new DaoExeption("Driver was not found", e);
		} catch (SQLException e) {
			throw new DaoExeption("Problem with reading book", e);
		}
		return book;
	}

	@Override
	public void addBook( String title, int pages) throws DaoExeption {

		Book book = new Book();
		book.setTitle(title);
		book.setPages(pages);
		Connection cn = null;
		PreparedStatement ps = null;

		try {
			Class.forName(DB_DRIVER);
			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);
			try {
				ps = cn.prepareStatement(SQL_INSERT_BOOK);

				ps.setString(1, book.getTitle());
				ps.setInt(2, book.getPages());
				ps.executeUpdate();
				// ps.executeQuery();
			} catch (SQLException e) {
				throw new DaoExeption("problem with adding new book", e);
			} finally {
				closeStatement(ps);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new DaoExeption("problem with db connection", e);
		} finally {
			closeConnection(cn);
		}

	}

	@Override
	public void deleteBook(int id) throws DaoExeption {
		
		Connection cn=null;
		PreparedStatement ps=null;

		try {
			Class.forName(DB_DRIVER);
			cn= DriverManager.getConnection(DB_URL,DB_USR,DB_PAS);
			try{
				ps = cn.prepareStatement(SQL_DELETE_BOOK);
				
				ps.setInt(1, id);
				ps.executeUpdate();
			}catch (SQLException e) {
				throw new DaoExeption("problem with delete book",e);
			}finally{
				closeStatement(ps);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new DaoExeption("problem with db connection",e);
		}
		finally{
			closeConnection(cn);
		}
	}

	@Override
	public void deleteBooks(int... id) throws DaoExeption {
		
		Connection cn=null;
		PreparedStatement ps=null;

		try {
			Class.forName(DB_DRIVER);
			cn= DriverManager.getConnection(DB_URL,DB_USR,DB_PAS);
			try{
				int count=0;
				for(int i=0;i<id.length;i++){
					if(id[i]>0){
					
						if(count!=0)
						SQL_DELETE_BOOKS+=", "+id[i];
						else
							SQL_DELETE_BOOKS+=id[i];
						count=count+1;
					}
				
				}
				SQL_DELETE_BOOKS+=")";
//				System.out.println(SQL_DELETE_BOOKS);
				ps = cn.prepareStatement(SQL_DELETE_BOOKS);
				
				ps.executeUpdate();
			}catch (SQLException e) {
				throw new DaoExeption("problem with delete book",e);
			}finally{
				closeStatement(ps);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new DaoExeption("problem with db connection",e);
		}
		finally{
			closeConnection(cn);
		}

		
		
	}

}
