
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%@ page isELIgnored="false"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*,java.text.SimpleDateFormat,com.todo.Model.Todo"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Todo List</title>
    <link rel="stylesheet" href="styles.css">
    
    <style type="text/css">
    
    /* Body and general styling */
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
}

/* Navbar styling */
nav {
    background-color: #d35400; /* Dark Orange */
    color: white;
    padding: 15px;
    text-align: center;
}

nav a {
    color: white;
    font-size: 18px;
    text-decoration: none;
    padding: 10px;
}

nav a:hover {
    background-color: #e67e22;
    color: white;
}

nav a.active {
    background-color: #e67e22;
}

/* Container for todo list */
.container {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 20px;
}

/* Todo list container */
.todo-list-container {
    width: 80%;
    background-color: white;
    border-radius: 8px;
    padding: 20px;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

/* Button to add todo */
button {
    background-color: #d35400; /* Dark Orange */
    color: white;
    border: none;
    padding: 10px;
    font-size: 16px;
    cursor: pointer;
    border-radius: 5px;
    margin-bottom: 20px;
}

button:hover {
    background-color: #e67e22;
}

/* Table styling */
table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
}

table th, table td {
    padding: 12px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}

table th {
    background-color: #f2f2f2;
    font-weight: bold;
}

table td a {
    color: #d35400;
    text-decoration: none;
    font-weight: bold;
}

table td a:hover {
    color: #e67e22;
}

table td {
    font-size: 16px;
}
    
    
    </style>
    
</head>
<body>

    <!-- Navbar -->
    <nav>
        <a href="index.jsp">Home</a>
        <a href="todoList.jsp" class="active">Todo List</a>
    </nav>

    <!-- Main Content -->
    <div class="container">
        <div class="todo-list-container">
            <h2>Todo List</h2>

            <!-- Button to Add Todo -->
            <button onclick="window.location.href='newTodo.jsp'">Add Todo</button>

            <!-- Todo Table -->
            <table>
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Target Date</th>
                        <th>Status</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <!-- Sample Todo Entries (You can dynamically populate this using Java or JSTL) -->
                    <tr class="alert" role="alert">
                                <% 
                                List<Todo> todoLi = (ArrayList<Todo>)session.getAttribute("TodoList");
                                for(Todo todo : todoLi) { 
                                %>
                                <tr>
                                    <td><%= todo.getTitle() %></td>
                                    <td><%= todo.getTargetDate() %></td>
                                    <td><%= todo.isStatus() %></td>
                                    
                                  
                                    
                                </tr>
                                <% } %>
                            </tr>
                    <!-- Additional Todo entries will be inserted here dynamically -->
                </tbody>
            </table>
        </div>
    </div>

</body>
</html>
