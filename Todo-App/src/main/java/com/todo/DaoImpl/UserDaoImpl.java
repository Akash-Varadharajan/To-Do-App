package com.todo.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.todo.Dao.UserDao;
import com.todo.Model.User;
import com.todo.Util.Driver;

public class UserDaoImpl implements UserDao {

	static Connection con;
	static {
		con = Driver.connect();
	}

	private PreparedStatement pstmt;
	
	@Override
	public int insert(User user) {
		
		String insert = "insert into users(first_name,last_name,email,password) values (?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(insert);
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getLastName());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPassword());
			return pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public User fetchOne(String email) {
		
		User user = null;
		String fetchOne = "select * from users where email = ?";
		try {
			pstmt = con.prepareStatement(fetchOne);
			pstmt.setString(1, email);
			ResultSet rr = pstmt.executeQuery();
			while(rr.next()) {
				
				user = new User(rr.getString("email"),rr.getString("password"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("User object from impl : "+user);
		return user;
	}

}
