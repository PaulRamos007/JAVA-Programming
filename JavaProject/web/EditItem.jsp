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
                    <td><input type="text" name="id" value="${orderId}"/></td>
                </tr>
                <tr>
                    <th>Status</th>
                    <td><input type="text" name="status" value="${status}"/></td>
                </tr>
                <tr>
                    <th>Name</th>
                    <td><input type="text" name="name" value="${name}"/></td>
                </tr>
                <tr>
                    <th>Description</th>
                    <td><input type="text" name="desc" value="${description}"/></td>
                </tr>
                <tr>
                    <th>Quantity</th>
                    <td><input type="text" name="qty" value="${quantity}"/></td>
                </tr>
                <tr>
                    <th>Price</th>
                    <td><input type="text" name="price" value="${price}"/></td>
                </tr>
                <tr>
                    <th>Delivered</th>
                    <td><input type="text" name="dlv" value="${delivered}"/></td>
                </tr>
                <tr>
                    <th>Discontinued</th>
                    <td><input type="text" name="disc" value="${discontinued}"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Update" />
            </table>

        </form>
    </body>
</html>
