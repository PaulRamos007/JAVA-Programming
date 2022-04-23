<%-- 
    Document   : showcookie
    Created on : Mar 21, 2022, 8:49:04 AM
    Author     : paula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Showing Cookie</title>
    </head>
    <body>
        <h3>
            Name is ${cookie.name.value}
        </h3>

        <%
            String name = null;
            for (Cookie myCookie : request.getCookies()) {
                if (myCookie.getName().equals("name")) {
                    name = myCookie.getValue();
                    break;
                }
            }

            if (name == null) {
                out.println("name is not provided");
            } else {
                out.println("Name is " + name);
            }
        %>
    </body>
</html>
