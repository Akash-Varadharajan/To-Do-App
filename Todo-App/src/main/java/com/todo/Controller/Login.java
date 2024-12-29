package com.todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.todo.Dao.TodoDao;
import com.todo.Dao.UserDao;
import com.todo.DaoImpl.TodoDaoImpl;
import com.todo.DaoImpl.UserDaoImpl;
import com.todo.Model.Todo;
import com.todo.Model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		UserDao impl = new UserDaoImpl();
		User user = impl.fetchOne(email);
		
		System.out.println("User object : "+user);
		
		String dbEmail = user.getEmail();
		String dbPwd = user.getPassword();
		
		if( (email.equals(dbEmail)) && ( password.equals(dbPwd)) ){
			
			
			
			RequestDispatcher rd = req.getRequestDispatcher("FetchAllTodoList");
			rd.forward(req, resp);
			
//			TodoDao dao = new TodoDaoImpl();
//			List<Todo> al = dao.fetchAll();
//			
//			HttpSession session = req.getSession();
//			session.setAttribute("email", email);
//			
//			session.setAttribute("TodoList", al);
//			
//			String url = "todoList.jsp";
//			PrintWriter out = resp.getWriter();
//	       
//	        out.println("<script>");
//	        out.println("alert('Login Successfull!')");
//	        out.println("window.location.href ='"+ url +"';");
//	  
//	        out.println("</script>");
	        
		}
		else {
			resp.sendRedirect("error.jsp");
		}
	}

}
