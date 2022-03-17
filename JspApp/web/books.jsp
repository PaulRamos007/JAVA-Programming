<%-- 
    Document   : books
    Created on : Mar 17, 2022, 2:46:32 PM
    Author     : paula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="javax.sql.rowset.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Books</title>
    </head>
    <body>
        <h1>Books</h1>

        <%
            Class.forName("com.mysql.jdbc.Driver");
            CachedRowSet row = RowSetProvider.newFactory().createCachedRowSet();
            row.setUrl("jdbc:mysql://localhost:3306/bookstoredb");
            row.setUsername("root");
            row.setPassword("P@ulmysql");

            row.setCommand("SELECT * FROM book");
            row.execute();
        %>

        <table>
            <tr>
                <th>Book ID</th>
                <th>Title</th>
                <th>Description</th>
                <th>Price</th>
            </tr>
            <%
                while (row.next()) {
                    String id = row.getString("book_id");
                    String title = row.getString("title");
                    String description = row.getString("description");
                    String price = row.getString("price");

                    String display = String.format("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td>", id, title, description, price);
                    out.println(display);
                }

            %>
        </table> 
    </body>
</html>
