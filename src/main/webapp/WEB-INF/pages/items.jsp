<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<html>
<head>
    <title>Items</title>
</head>
<body>



<br>
<h1>Items List</h1>
<br>

<form action="/" method="post">
    Find:
    <input type="text" name="name"/>
    <input type="submit" title="find"/>
</form>

<table border="1">
    <tr>
        <th width="80">ID</th>
        <th width="120">NAME</th>>
    </tr>
    <c:forEach items="${listJSP}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
        </tr>
    </c:forEach>
</table>

<br>

<form action="/add" method="post">
    Add new:
    <input type="text" name="name"/>
    <input type="submit" title="Add new"/>
</form>


</body>
</html>
