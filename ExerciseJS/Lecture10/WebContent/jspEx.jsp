<%-- ���þ�: �������� jsp�������� ó���ϴ� ��� ���� 
1)page: ������ �⺻ ����<% page �Ӽ�="�Ӽ� ��> - �׻� ������
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
2)include: �ٸ� ����(jsp) �������� ���� �� include file ����<%include file="���ϸ�"> - �� ���� ���������� �������� ������ �ְ� ���� ��
3)taglib: �ܺ� ���̺귯��, jsp���� ������� �ʴ�! ���̺귯�� �±� <%taglib uri="uri" prefix="namespace">
--%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<!-- ���� �±�: JSP ���������� Java�� �������, �޼��� ����!! -->
	<%!int num = 10;
	String str = "jsp";
	ArrayList<String> list = new ArrayList<String>();

	public void jspMethod() {
		System.out.println(" --jspMethod()");
	}%>
	<%-- jsp�� �ּ� �±� --%>

	<!-- ��ũ��Ʈ�� �±�: JSP���������� Java�ڵ�(������ ���� �� ����)�� �ֱ� ���� �±� -->
	<%
		if (num > 0) {
	%>
	<p>num>0</p>
	<%
		} else {
	%>
	<p>num<=0</p>
	<%
		}
	%>

	<!-- ǥ���� �±�: ����, �޼��� ��ȯ���� ���! -->
	<p>num is<%=num%></p>
	<%@include file="footer.jsp" %>
	
</body>
</html>