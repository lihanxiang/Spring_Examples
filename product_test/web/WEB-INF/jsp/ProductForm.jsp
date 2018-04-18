<%--
  Created by IntelliJ IDEA.
  User: 94545
  Date: 2018/4/17
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form action="product_save" method="post">
            <fieldset>
                <legend>Add a product</legend>
                <p>
                    <label for="name">Product Name: </label>
                    <input type="text" id="name" name="name">
                </p>
                <p>
                    <label for="price">Price: </label>
                    <input type="text" id="price" name="price">
                </p>
                <p>
                    <label for="inventory">Inventory: </label>
                    <input type="text" id="inventory" name="inventory">
                </p>
                <p>
                    <input id="reset" type="reset" tabindex="4">
                    <input id="submit" type="submit" tabindex="5" value="Add Product">
                </p>
            </fieldset>
        </form>
    </div>
</body>
</html>
