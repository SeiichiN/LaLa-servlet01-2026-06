<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>hiddenフィールドの使用(p153)</h2>
	<form action="SampleServlet" method="POST">
		<input type="hidden" name="hoge" value="foo">
		<input type="submit" value="送信">
	</form>
	
	<h2>クエリ文字列を使う(p154)</h2>
	<a href="SampleServlet?hoge=foo">リンク</a>
</body>
</html>