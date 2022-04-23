<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="restaurantStyleSheet.css">
        <title>Edit Item</title>
    </head>
    <body>
        <h1>Edit Item</h1>
        <form action="UpdateItemServlet" method="post" class="addform">

            <table>
                <tr>
                    <th>ID</th>
                    <td><input type="text" name="ORDER_ID" value="${orderId}"/></td>
                </tr>
                <tr>
                    <th>Status</th>
                    <td><input type="text" name="STATUS_ID" value="${status}"/></td>
                </tr>
                <tr>
                    <th>Name</th>
                    <td><input type="text" name="NAME" value="${name}"/></td>
                </tr>
                <tr>
                    <th>Price</th>
                    <td><input type="text" name="PRICE" value="${price}"/></td>
                </tr>
                <tr>
                    <th>Quantity</th>
                    <td><input type="text" name="QUANTITY" value="${quantity}"/></td>
                </tr>
                <tr>
                    <th>Premium</th>
                    <td><input type="text" name="PREMIUM" value="${premium}"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Update" />
            </table>

        </form>
    </body>
</html>
