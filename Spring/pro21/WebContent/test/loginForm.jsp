<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form name="frmLogin" method="post"  action="${contextPath}/test/login.do"><!-- DispatcherServlet�� ��û�ϴ� ���� -->
   <table border="1"  width="80%" align="center" >
      <tr align="center">
         <td>���̵�</td>
         <td>��й�ȣ</td>
      </tr>
      <tr align="center">
         <td>
	    <input type="text" name="userID" value="" size="20"><!-- ���� �����ִ� name�� value�� ������ -->
	 </td>
         <td>
	    <input type="password" name="passwd" value="" size="20">
	 </td>
      </tr>
      <tr align="center">
         <td colspan="2">
            <input type="submit" value="�α���" > 
            <input type="reset"  value="�ٽ��Է�" > 
         </td>
      </tr>
   </table>
</form>
</body>
</html>
