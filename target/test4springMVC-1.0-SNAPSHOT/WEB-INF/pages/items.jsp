<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Items</title>
</head>
<body>

    <br>
    <h1>Items List</h1>
    <br>

    <form action="/find" method="post">
        Find:
        <input type="text" name="name">
        <input type="submit" title="find"/>
    </form>


    <form action="/addNew" method="post">
        Add new:
        <input type="text" name="name">
        <input type="submit" title="Add new"/>
    </form>


</body>
</html>
