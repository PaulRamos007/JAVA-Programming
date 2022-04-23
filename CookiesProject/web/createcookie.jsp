<%-- 
    Document   : createcookie
    Created on : Mar 21, 2022, 8:39:49 AM
    Author     : paula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Cookie</title>
    </head>
    <body>
        <%
            Cookie mycookie = new Cookie("name", "Paul");
            mycookie.setMaxAge(5 * 24 * 60 * 60);
            response.addCookie(mycookie);
            out.println("The cooklie is successfully created");
        %>
    </body>
</html>
