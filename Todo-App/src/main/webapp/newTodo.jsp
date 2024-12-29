
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Todo</title>
    <link rel="stylesheet" href="styles.css">
    
    
    <style>
    
    /* Body and general styling */
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
}

/* Navbar styling */
nav {
    background-color: #2c3e50;
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
    background-color: #34495e;
    color: white;
}

/* Container for form */
.container {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 50px;
}

/* Form container styling */
.form-container {
    width: 400px;
    background-color: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

/* Title styling */
h2 {
    text-align: center;
    color: #2c3e50;
}

/* Input fields and textarea styling */
input[type="text"], input[type="date"], select, textarea {
    width: 100%;
    padding: 12px;
    margin: 8px 0;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 14px;
}

textarea {
    resize: vertical;
    height: 100px;
}

/* Button styling */
button {
    background-color: #2980b9;
    color: white;
    border: none;
    padding: 12px 20px;
    font-size: 16px;
    cursor: pointer;
    border-radius: 5px;
    width: 100%;
}

button:hover {
    background-color: #3498db;
} 



    
    
    </style>
</head>
<body>

    <!-- Navbar -->
    <nav>
        <a href="index.jsp">Home</a>
        <a href="todoList.jsp">Todo List</a>
    </nav>

    <!-- Main Content -->
    <div class="container">
        <div class="form-container">
            <h2>Create Todo</h2>

            <!-- Todo Form -->
            <form action="AddTodoServlet" method="post">

                <!-- Todo Title -->
                <label for="title">Todo Title:</label>
                <input type="text" id="title" name="title" required><br><br>

                <!-- Todo Description -->
                <label for="description">Todo Description:</label>
                <textarea id="description" name="description" required></textarea><br><br>

                <!-- Target Date -->
                <label for="targetDate">Target Date:</label>
                <input type="date" id="targetDate" name="targetDate" required><br><br>

                <!-- Status -->
                <label for="status">Status:</label>
                <select id="status" name="status" required>
                    <option value="Pending">Pending</option>
                    <option value="In Progress">In Progress</option>
                    <option value="Completed">Completed</option>
                </select><br><br>

                <!-- Submit Button -->
                <button type="submit">Add Todo</button>
            </form>
        </div>
    </div>

</body>
</html>
