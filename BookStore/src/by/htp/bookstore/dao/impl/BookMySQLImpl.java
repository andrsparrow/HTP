package by.htp.bookstore.dao.impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.bookstore.dao.AbstractDao;
import by.htp.bookstore.dao.DaoExeption;
import by.htp.bookstore.domain.entity.Book;

public class BookMySQLImpl extends AbstractDao implements by.htp.bookstore.dao.BookDao {
	
	private static final String DB_URL="jdbc:mysql://localhost/bookcatalog?"
			+ "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
	private static final String DB_USR="root";
	private static final String DB_PAS="root";
	private static final String DB_DRIVER= "com.mysql.cj.jdbc.Driver";
	private static final String SQL_INSERT_BOOK = "INSERT INTO book (title, pages) VALUES (?, ?)";
	private static final String SQL_SELECT_BOOK = "SELECT * FROM book WHERE id=?";
	private static final String SQL_DELETE_BOOK = "DELETE FROM book WHERE  id=?";
	private static final String SQL_UPDATE_BOOK = "UPDATE book SET title =?, pages=? WHERE  id = ?";
	
	
	public BookMySQLImpl() {
		
	}

	@Override
	public List<Book> readBooks() {
		
		List<Book>	books=null;
		
		try{
			Class.forName(DB_DRIVER);
			
			Connection cn = DriverManager.getConnection(DB_URL,DB_USR,DB_PAS);
			
			Statement st =  cn.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM book");
			
			books = new ArrayList<Book>();
			
			while(rs.next()){
				Book book = new Book();
				int id= rs.getInt(1);
				String title= rs.getString(2);
				int pages= rs.getInt(3);
				
				book.setId(id);
				book.setTitle(title);
				book.setPageCount(pages);
				
				books.add(book);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return books;
	}

	@Override
	public Book readBook(int id) throws DaoExeption {
		
		Connection cn=null;
		PreparedStatement ps= null;
		ResultSet rs= null;
		Book book=null;
		
		try{
			Class.forName(DB_DRIVER);
			cn= DriverManager.getConnection(DB_URL,DB_USR,DB_PAS);
			
			ps=cn.prepareStatement(SQL_SELECT_BOOK);
			ps.setInt(1, id);
			
			rs= ps.executeQuery();
			if(rs.next()){
				book=new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setPageCount(rs.getInt("pages"));
			}
			
		}catch(ClassNotFoundException e){
			throw new DaoExeption("Driver was not found",e);
		} catch (SQLException e) {
			throw new DaoExeption("Problem with reading book",e);
		}
		
		return book;
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
//				ps.executeQuery();
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
	public void addBook(Book book) throws DaoExeption {
		
			Connection cn=null;
			PreparedStatement ps=null;

			try {
				Class.forName(DB_DRIVER);
				cn= DriverManager.getConnection(DB_URL,DB_USR,DB_PAS);
				try{
					ps = cn.prepareStatement(SQL_INSERT_BOOK);
					
					ps.setString(1, book.getTitle());
					ps.setInt(2, book.getPageCount());
					ps.executeUpdate();
//					ps.executeQuery();
				}catch (SQLException e) {
					throw new DaoExeption("problem with adding new book",e);
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
	public void updateBook(Book book) throws DaoExeption {
		
		Connection cn=null;
		PreparedStatement ps=null;

		try {
			Class.forName(DB_DRIVER);
			cn= DriverManager.getConnection(DB_URL,DB_USR,DB_PAS);
			try{
				ps = cn.prepareStatement(SQL_UPDATE_BOOK);
				
				ps.setString(1, book.getTitle());
				ps.setInt(2, book.getPageCount());
				ps.setInt(3, book.getId());
				ps.executeUpdate();
//				ps.executeQuery();
				
			}catch (SQLException e) {
				throw new DaoExeption("problem with updating book",e);
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
