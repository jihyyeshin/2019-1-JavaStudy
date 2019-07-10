package kr.co.javastudy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.co.javastudy.common.MyAppSqlConfig;
import kr.co.javastudy.mapper.CommentMapper;
import kr.co.javastudy.vo.Comment;

@WebServlet("/addComment.do")
public class AddCommentController extends HttpServlet {
	
	/*
	 �ϴ�, CommentMapper ��ü�� �����Ѵ�.
	�� �������̽��� ������ comment.xml����! �����ͺ��̽��� ����
	 */
	private CommentMapper mapper;
	
	public AddCommentController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(CommentMapper.class);
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		/*comment ��ü�� ���� ��۰� board_no�� set���ش�.*/
		Comment comment =new Comment();
		comment.setContent(request.getParameter("comment"));
		comment.setBoardNo(Integer.parseInt(request.getParameter("board_no")));
		/*�� �� �����ͺ��̽��� comment�� insert*/
		/*�� �� select key�� �̿��Ͽ� key���� �޾ƿ� comment.xml����
		 �� ������ ���Ͽ� auto_increment�Ǿ� �� �� ������ no�� ���� �Բ� comment�� �־�����.*/
		mapper.insertComment(comment);
		PrintWriter out =response.getWriter();
		/* result�� json���·� jsp���Ͽ� return �ȴ�.*/
		String result=new Gson().toJson(comment);
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(result);
        out.flush();
	}
}
