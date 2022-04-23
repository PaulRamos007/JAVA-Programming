<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="restaurantStyleSheet.css">
        <title>Create a new Menu Item</title>
    </head>
    <body>
        <h1>Add a new Item</h1>
        <form action="AddItemServlet" method="post" class="addform">
            <label> ID:</label><input type="text" name="ORDER_ID" required id="txt"><p></p>
            <label> Status : </label><input type="text" name="STATUS_ID" required id="txt"><P></P>
            <label>Name :</label> <input type="text" name="NAME" required id="txt"><P></P>
            <label> Price : </label><input type="text" name="PRICE" required id="txt"><P></P>
            <label> Quantity:</label><input type="text" name="QUANTITY" required id="txt"><p></p>
            <label>Premium :</label> <input type="text" name="PREMIUM" required id="txt"><P></P>
            
             <input type="submit" value="submit">
        </form>
    </body>
</html>
