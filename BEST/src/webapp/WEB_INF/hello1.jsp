<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FORM</title>
</head>
<body>
<h1>REGISTRATION FORM</h1>
<form action="@{/register}" method="post">
<div><label><p>NAME: </p></label><input type="text" name = "name"></div>
<div><label><p>EMAIL:</p></label><input type="text" name = "email"></div>
<div><label><p>PASSWORD:</p></label><input type="text" name = "password"></div>
<div><button type="submit">register</button></div>
</form>
</body>
</html>