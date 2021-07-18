package com.chinasofti.meetingsys.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.meetingsys.entity.User;
import com.chinasofti.meetingsys.service.UserService;
import com.google.gson.Gson;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//�����û����ݵ�ֵ   username   password
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("�û���:"+username+";����:"+password);
		//����service
		UserService us = new UserService();
		User user = us.login(username, password);
		
		PrintWriter out = response.getWriter();
		Gson gson = new Gson();
		
		if(user!=null){
			//��¼�ɹ� 
			//���û��洢�ڵ�ǰ�Ự������   �Ự����  Ϊ��ʵ��  ��ӭ����������ֻ�е�¼д��
			HttpSession session = request.getSession();
			session.setAttribute("loginuser", user);
			//ͨ��io�� �����Ӧ�����ݣ�����gson����  ������ת��Ϊjson��ʽ
			Map<String, Object> result = new HashMap<String,Object>();
			result.put("errorcode", 0);
			result.put("status", "��¼�ɹ�");
			result.put("user", user);
			Map<String, Object> map = new HashMap<String,Object>();
			map.put("result", result);
			//��map����תΪjson���ʹ��ݸ�ǰ��
			out.println(gson.toJson(map));
		}else{
			//ͨ��io�� �����Ӧ�����ݣ�����gson����  ������ת��Ϊjson��ʽ
			Map<String, Object> result = new HashMap<String,Object>();
			result.put("errorcode", 403);
			result.put("status", "��¼ʧ��");
			Map<String, Object> map = new HashMap<String,Object>();
			map.put("result", result);
			//��map����תΪjson���ʹ��ݸ�ǰ��
			out.println(gson.toJson(map));
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
