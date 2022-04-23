<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="restaurantStyleSheet.css">
        <title>Show Order Items</title>
    </head>
    <body>
        <h1>Order Items</h1>
        <form action="CreateItem.jsp">
            <button type="submit" class="addbtn">Add a new Menu Item</button>

        </form>

        <table>
            <tr><th>ID</th><th>Status</th><th>Name</th><th>Price</th><th>Quantity</th><th>Premium</th><th></th><th></th></tr>

            <c:forEach items="${theOrderItems}" var="temp">
                <tr>
                    <td>${temp.id}</td>
                    <td>${temp.status}</td>
                    <td>${temp.name}</td>
                    <td>${temp.price}</td>
                    <td>${temp.quantity}</td>
                    <td>${temp.premium}</td>

                    <td>
                        <form action="DeleteServlet">
                            <input type="hidden" name="id" value="${temp.id}">
                            <button type="submit" class="delbtn">Delete</button>
                        </form>
                    </td>
                    <td>
                        <form action="BuildItemServlet">
                            <input type="hidden" name="id" value="${temp.id}">
                            <button type="submit" class="updbtn">Update</button>
                        </form>
                    </td>
                </tr>


            </c:forEach>

        </table>
    </body>
</html>
