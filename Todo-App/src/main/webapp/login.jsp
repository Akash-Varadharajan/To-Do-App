

<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Registration</title>
    <link rel="stylesheet" href="styles.css">
    
    
    <style>
    
    /* Body and background */
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-image: url('your-background-image.jpg'); /* Replace with your background image URL */
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    color: #fff;
}

/* Navbar styling */
nav {
    background-color: orange;
    padding: 15px;
    text-align: center;
    height: 50px;
}

nav a {
    color: white;
    font-size: 18px;
    padding: 20px;
    text-decoration: none;
    margin: 0px;
}

nav a:hover {
    background-color: #333;
    color: white;
}

/* Container for the registration form */
.container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    
}

.form-container {
    background-color: rgba(0, 0, 0, 0.6);
    padding: 30px;
    border-radius: 8px;
    width: 400px;
    text-align: center;
}

/* Form inputs styling */
input[type="text"], input[type="email"], input[type="password"] {
    width: 90%;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 14px;
}

/* Submit button styling */
input[type="submit"] {
    background-color: orange;
    color: white;
    border: none;
    padding: 10px;
    border-radius: 5px;
    width: 90%;
    cursor: pointer;
    font-size: 16px;
}

input[type="submit"]:hover {
    background-color: #ff5722;
}
    
    
    </style>
    <script type="text/javascript">
        function validateForm() {
          
            var email = document.getElementById("email").value;
            var password = document.getElementById("password").value;

            if ( email == "" || password == "") {
                alert("All fields must be filled out.");
                return false;
            }
            return true;
        }
    </script>
 
    
</head>
<body>

    <!-- Navbar -->
    <nav style="background-color: orange; padding: 10px; text-align: center;">
        <a href="index.jsp" style="color: white; font-size: 20px; text-decoration: none;">Home</a> | 
        <a href="userRegistration.jsp" style="color: white; font-size: 20px; text-decoration: none;">Register</a>
    </nav>

    <!-- Main Content -->
    <div class="container">
        <div class="form-container">
            <h2>User Registration</h2>

            <form action="Login" method="post" onsubmit="return validateForm()">
               

                <label for="email">Email:</label><br>
                <input type="email" id="email" name="email" required><br><br>

                <label for="password">Password:</label><br>
                <input type="password" id="password" name="password" required><br><br>

                <input type="submit" value="Register">
                
                <p id="rn" class="text-center dont-do text-white mt-3">Don't have an account?
						<a href="userRegistration.jsp"  class="text-white">
							Register Now</a>
					</p>
            </form>
        </div>
    </div>

</body>
</html>
