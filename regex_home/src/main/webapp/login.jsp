<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
	<h1>ログイン処理</h1>
	<form action="LoginServlet" method="post">
		ID:<input type="text" name="id" placeholder="半角英数字１文字以上"><br>
		パスワード:<input type="password" name="password" placeholder="半角英数字4〜8文字"><br>
		<input type="submit" value="ログイン">
	</form>
</body>
</html>