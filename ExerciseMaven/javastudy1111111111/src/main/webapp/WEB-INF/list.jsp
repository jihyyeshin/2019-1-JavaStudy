<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 example</title>
<style>
   th,td {
      text-align : center;
      vertical-align : middle;
   }
</style>
</head>
<body>
   <h1>글 목록</h1>
   <table>
      <tr>
         <th>글번호</th>
         <th>제목</th>
         <th>등록날짜</th>
      </tr>
      <c:forEach var="board" items="${board}">
      <form action="detail.do" method="post">
         <tr>
            <td>${board.no}</td>
            <td>${board.title}</a></td>
            <td><fmt:formatDate value="${board.regDate}" pattern="yy.MM.dd HH:mm:ss" /></td>
            <td><input type="hidden" name="no" value="${board.no}"></td>
            <td><input type="submit" value="show detail"></td>
         </tr>
      </form>
      </c:forEach>
   </table>
   <a href="insertForm.do">글쓰기</a>
</body>
</html>