<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add/Edit Todo Item</title>
</head>
<body>
    <h1>${action == 'add' ? 'Add' : 'Edit'} Todo Item</h1>
    <form action="${action == 'add' ? 'addTodo' : 'editTodo'}" method="post">
        <input type="hidden" name="id" value="${todoItem.id}">
        Description: <input type="text" name="description" value="${todoItem.description}"><br>
        Completed: <input type="checkbox" name="completed" ${todoItem.completed ? 'checked' : ''}><br>
        <input type="submit" value="${action == 'add' ? 'Add' : 'Update'}">
    </form>
</body>
</html>
