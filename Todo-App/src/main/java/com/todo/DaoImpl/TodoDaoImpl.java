package com.todo.DaoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.todo.Dao.TodoDao;
import com.todo.Model.Todo;
import com.todo.Util.Driver;

public class TodoDaoImpl implements TodoDao {
	
	static Connection con;
	static {
		con = Driver.connect();
	}

	private PreparedStatement pstmt;

	@Override
	public int insert(Todo todo) {
		String insert = "insert into todos(description, is_done, target_date, userEmail, title) values(?,?,?,?,?)";
		
		
		Date date = Date.valueOf(todo.getTargetDate());
		
		
		try {
			
			pstmt = con.prepareStatement(insert);
			pstmt.setString(1, todo.getDescription());
			pstmt.setString(2, todo.isStatus());
			pstmt.setDate(3, date);
			pstmt.setString(4, todo.getEmail());
			pstmt.setString(5, todo.getTitle());
			
			return pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	
	@Override
	public List<Todo> fetchAll() {
		
		List<Todo> al = new ArrayList<Todo>();
		String fetchAll = "select * from todos";
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rr = stmt.executeQuery(fetchAll);
			while(rr.next()) {
				
				 Date date = rr.getDate("target_date");
				 
				 LocalDate lDate = date.toLocalDate();
				
				Todo todo = new Todo(rr.getInt("id") ,rr.getString("title"),
						rr.getString("userEmail"), rr.getString("description"), 
						lDate,rr.getString("is_done"));
				
				al.add(todo);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}

	
	
	
	
	
	
	
	
	
	
	
}
