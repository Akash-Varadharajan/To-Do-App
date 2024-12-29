package com.todo.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.todo.Dao.UserDao;
import com.todo.DaoImpl.UserDaoImpl;
import com.todo.Model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserRegistration extends HttpServlet {
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Get data from the request
	        String firstName = request.getParameter("firstName");
	        String lastName = request.getParameter("lastName");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        
	        User user = new User(firstName,lastName,email,password);
	        
	        UserDao impl = new UserDaoImpl();
	        
	       try {
	    	   if(impl.insert(user) == 1) {
		        	
	    		   String url = "login.jsp" ;
		        	PrintWriter out = response.getWriter();
			        out.println("<script>");
			        out.println("window.location.href = '"+url +"';");
			        out.println("</script>");
		        }
	    	   else {
	    		   PrintWriter out = response.getWriter();
	    		   out.println("<script>");
	    		   out.println("alert('Sorry something went wrong!')");
	    		   out.println("</script>");
	    	   }
	       }
	       catch(Exception e) {
	    	   e.printStackTrace();
	       }

	        
	        
	    }


}



