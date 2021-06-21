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

import com.chinasofti.meetingsys.entity.User;
import com.chinasofti.meetingsys.service.UserService;
import com.google.gson.Gson;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
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
				User u = new User(1,username,password);
				boolean success = us.regist(u);
				
				PrintWriter out = response.getWriter();
				Gson gson = new Gson();
				
				if(success){
					//ͨ��io�� �����Ӧ�����ݣ�����gson����  ������ת��Ϊjson��ʽ
					Map<String, Object> result = new HashMap<String,Object>();
					result.put("errorcode", 0);
					result.put("status", "ע��ɹ�");
					Map<String, Object> map = new HashMap<String,Object>();
					map.put("result", result);
					//��map����תΪjson���ʹ��ݸ�ǰ��
					out.println(gson.toJson(map));
				}else{
					//ͨ��io�� �����Ӧ�����ݣ�����gson����  ������ת��Ϊjson��ʽ
					Map<String, Object> result = new HashMap<String,Object>();
					result.put("errorcode", 200);
					result.put("status", "ע��ʧ��");
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
