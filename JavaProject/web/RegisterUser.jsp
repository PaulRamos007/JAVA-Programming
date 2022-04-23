<%-- 
    Document   : RegisterUser
    Created on : Apr 12, 2022, 3:27:42 PM
    Author     : paula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account</title>
        <link rel="stylesheet" href="restaurantStyleSheet.css">
    </head>
    <body>
        <div class="container">
            <div class="regbox">
                <h1>Register Account</h1>
                <form action="RegisterServlet" method="post">
                    <p>ID</p>
                    <input type="text" placeholder="ID Number" name="id" required>
                    <p>Username</p>
                    <input type="text" placeholder="Username" name="userName" required>
                    <p>Password</p>
                    <input type="password" placeholder="Password" name="password" required>
                    <p>Full Name</p>
                    <input type="text" placeholder="Full Name" name="fullName" required>
                    <p>Email</p>
                    <input type="text" placeholder="Email" name="email" required>
                    <p>Organization</p>
                    <input type="text" placeholder="Organization" name="org" required>
                    <br>
                    <span stlye="color: red;">${Error}</span>
                    <br><br>
                    <input type="submit" value="Register">
                    <a href="Login.jsp">Already have Account?</a>
                </form>
            </div>
        </div>
    </body>
</html>
