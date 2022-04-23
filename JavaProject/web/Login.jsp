<%-- 
    Document   : Login
    Created on : Apr 12, 2022, 3:24:03 PM
    Author     : paula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="restaurantStyleSheet.css">
        <title>Login - Online Orders</title>
    </head>
    <body class="loginpage">
        <div class="container">
            <div class="logbox">
                <h1>Login Account</h1>
                <form action="LoginServlet" method="post">
                    <p>Username</p>
                    <input type="text" placeholder="Username" name="username" required>
                    <p>Password</p>
                    <input type="password" placeholder="Password" name="password" required>
                    <br>
                    <span style="color: red; font-weight: bold;">${Error}</span>
                    <br><br>
                    <input type="submit" value="Login">
                    <br>
                    <p><a href="RegisterUser.jsp">Sign Up Here!</a></p>
                </form>
            </div>
        </div>
    </body>
</html>
