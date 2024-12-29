package com.todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.todo.Dao.TodoDao;
import com.todo.DaoImpl.TodoDaoImpl;
import com.todo.Model.Todo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class FetchAllTodoList extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		TodoDao dao = new TodoDaoImpl();
		List<Todo> al = dao.fetchAll();
		
		HttpSession session = req.getSession();
		session.setAttribute("TodoList", al);
		
		String url = "todoList.jsp";
		PrintWriter out = resp.getWriter();
       
        out.println("<script>");
        out.println("alert('Login Successfull!')");
        out.println("window.location.href ='"+ url +"';");
  
        out.println("</script>");
        
	}

}
