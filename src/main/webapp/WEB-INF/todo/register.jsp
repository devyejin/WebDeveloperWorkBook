<%--
  Created by IntelliJ IDEA.
  User: endea
  Date: 2023-07-03
  Time: PM 5:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo list register Page</title>
</head>
<body>
  <form action="/todo/register" method="post">
    <label for="content">목록</label>
    <input type="text" id="content">
    <label for="date">날짜 선택</label>
    <input type="date" id="date">
    <button type="submit">등록하기</button>
  </form>
</body>
</html>
