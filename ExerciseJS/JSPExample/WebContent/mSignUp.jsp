<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	�� �����̳ʿ��� ������ ���� �� ����ϴ� ��: request ��ü
	���� ������ �� ���̴�, �� ������ ���̴� ���̱� ������ : response ��ü
	
	jsp���� ��û�� ������ �����ϴ� ���� request�̰�,(���� ���̴� �� - form���� ������ ��)
	������ ���� ��û�� ��.
	jsp���� ������ ������ �����ϴ� ���� response�̴�.(���� ���̴� �� - �����̷�Ʈ ���) 
	�������� ���� ������ ����.
	 -->
	<%
		String m_name;
		String m_pass;
		String[] m_hobby;
	%>
	<%
		m_name = request.getParameter("m_name");
		m_pass = request.getParameter("m_pass");
		m_hobby = request.getParameterValues("m_hobby");
	%>
	
	m_name : <%= m_name %> <br>
	m_passwd : <%= m_pass %> <br>
	<%
	for(int i=0;i<m_hobby.length;i++){
	%>
	<%=m_hobby[i] %>
	<% }%><br>

</body>
</html>