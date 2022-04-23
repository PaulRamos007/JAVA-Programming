<%-- 
    Document   : savecountry
    Created on : Mar 21, 2022, 9:06:20 AM
    Author     : paula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Country</title>
    </head>
    <body>
        <%
            Cookie mycookie = new Cookie("country", request.getParameter("countryname"));
            mycookie.setMaxAge(5 * 24 * 60 * 60);
            response.addCookie(mycookie);
            response.sendRedirect("showcountry.jsp");
        %>
    </body>
</body>
</html>
