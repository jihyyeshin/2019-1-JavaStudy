package com.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tsc")
public class TestServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// �����ڸ��� ������ �޼ҵ带 ����
	@PostConstruct
	public void postConstruct() {
		System.out.println(" -- @postConstruct -- ");
	}

	// ���� ���񽺸� ���, ���� �ܰ�
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(" -- doGet() --");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	// �ʱ�ȭ, ���� �����ܰ�
	@Override
	public void init() throws ServletException {
		System.out.println(" -- init() --");
	}

	// ���� �ܰ�, �ڿ� ���� ��
	@Override
	public void destroy() {
		System.out.println(" -- destory() --");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println(" -- @preDestory --");
	}

}
