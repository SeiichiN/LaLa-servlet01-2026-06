<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>練習5_2</title>
</head>
<body>
	<h2>練習5_2</h2>
	<form action="testenq" method="post">
		名前：<br>
		<input type="text" name="name"><br>
		お問い合わせの種類：<br>
		<select name="qtype">
			<option value="company">会社について</option>
			<option value="product">製品について</option>
			<option value="support">アフターサポートについて</option>
		</select><br>
		お問い合わせ内容：<br>
		<textarea rows="4" cols="40" name="body"></textarea><br>
		<input type="submit" value="送信">
	</form>
</body>
</html>