package com.todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import com.todo.Dao.TodoDao;
import com.todo.DaoImpl.TodoDaoImpl;
import com.todo.Model.Todo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddTodoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//String title, String email, String description, Date targetDate, String status
		
		/*  

          import java.time.LocalDate;
          import java.time.format.DateTimeFormatter;

          String targetDateString = request.getParameter("targetDate");

         // Convert string to LocalDate
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate targetDate = LocalDate.parse(targetDateString, formatter);

		  
		 
		 */

		String title = request.getParameter("title");
		String description = request.getParameter("description");
		
		String targetDate =  request.getParameter("targetDate");
		LocalDate date = LocalDate.parse(targetDate);
		
		
		String status = request.getParameter("status");

		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		
		
	
		Todo newTodo = new Todo(title, email , description, date, status);
		
		TodoDao impl = new TodoDaoImpl();
		impl.insert(newTodo);
		 //
		
		RequestDispatcher rd = request.getRequestDispatcher("FetchAllTodoList");
		rd.forward(request, response);

		// Redirect to the Todo List or a confirmation page
		response.sendRedirect("");

	}

}




