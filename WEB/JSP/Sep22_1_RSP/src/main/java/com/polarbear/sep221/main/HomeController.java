package com.polarbear.sep221.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Java + JSP + CSS + Servlet
//���������� �������� ���� ��!
// �������� �˾Ƽ�...
//Was ������ ������ ������ ���̰� => ���� ������ ������ ���� ���̵���(�ٲ��)

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!request.getParameterNames().hasMoreElements()) {
			request.getRequestDispatcher("View/RSP.jsp").forward(request, response);
		}else {
			
			M.getM().Game(request);
			request.getRequestDispatcher("View/RSP.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}