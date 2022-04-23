<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="restaurantStyleSheet.css">
        <title>Create a new Order</title>
    </head>
    <body>
        <h1>Add a new Order</h1>
        <form action="AddItemServlet" method="post" class="addform">
            <label> ID:</label><input type="text" name="ID" required id="txt"><p></p>
            <label> Status : </label><input type="text" name="STATUS" required id="txt"><P></P>
            <label>Name :</label> <input type="text" name="NAME" required id="txt"><P></P>
            <label>Description :</label> <input type="text" name="DESCRIPTION" required id="txt"><P></P>
            <label> Quantity:</label><input type="text" name="QUANTITY" required id="txt"><p></p>
            <label> Price : </label><input type="text" name="PRICE" required id="txt"><P></P>
            <label>Delivered :</label> <input type="text" name="DELIVERED" required id="txt"><P></P>
            <label>Discontinued :</label> <input type="text" name="DISCONTINUED" required id="txt"><P></P>
            
             <input type="submit" value="submit">
        </form>
    </body>
</html>
