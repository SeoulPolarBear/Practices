package com.polarbear.sep212.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Controller : Servlet
//		��Ȳ�Ǵ��ؼ� M/V ��ȯ
//			-> � ��û�� ������ ��, �Ǵ��ؼ� M/V�� ��ȯ
//		�� ����Ʈ�� ������ (������ ���⼭ !!!)

//		 Back-end �� ������ A - PL�� (Project Leader)


@WebServlet("/C")
public class C extends HttpServlet {
	//� ����Ʈ�� ����
	// 1. �ּҸ� ���� �Է�
	// 2. �˻� -> <a> ������
	//		�� �� ��� �� GET��� ��û(� ����Ʈ�� POST�� ù ���� - X)
	//
	
	//JSP�� HTML ���� JSP�� request�� ���� ������ ó�� �� �� �ִ�.
	//������ JSP�� �Ұ��� �ϹǷ� JSP�� �ַ� ����ϰ� �ȴ�.
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("HTML/V1.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		M.add(request);
		request.getRequestDispatcher("JSP/V2.jsp").forward(request,response);
		
	}

}