<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Todo List</title>
</head>
<body>
    <h1>Todo List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Description</th>
            <th>Completed</th>
        </tr>
        <c:forEach var="todoItem" items="${todoItems}">
            <tr>
                <td>${todoItem.id}</td>
                <td>${todoItem.description}</td>
                <td>${todoItem.completed ? 'Yes' : 'No'}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
