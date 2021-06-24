package com.lnu.signinsys.controller;

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

import com.lnu.signinsys.entity.Qd;
import com.lnu.signinsys.service.QdService;
import com.google.gson.Gson;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/qd/login.do")
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
		//username   password
		String stuName = request.getParameter("stuName");
		String password = request.getParameter("password");
		System.out.println("学生姓名:" + stuName + "密码:" + password);
		//service
		QdService qs = new QdService();
		Qd qd = qs.login(stuName, password);
		
		PrintWriter out = response.getWriter();
		Gson gson = new Gson();
		
		if(qd!=null){
			
			HttpSession session = request.getSession();
			session.setAttribute("loginuser", qd);
			
			Map<String, Object> result = new HashMap<String,Object>();
			result.put("errorcode", 0);
			result.put("status", "¼");
			result.put("qd", qd);
			Map<String, Object> map = new HashMap<String,Object>();
			map.put("result", result);
			
			out.println(gson.toJson(map));
		}else{
			
			Map<String, Object> result = new HashMap<String,Object>();
			result.put("errorcode", 403);
			result.put("status", "¼");
			Map<String, Object> map = new HashMap<String,Object>();
			map.put("result", result);
			
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
