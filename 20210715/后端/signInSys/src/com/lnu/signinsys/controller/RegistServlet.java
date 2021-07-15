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

import com.google.gson.Gson;
import com.lnu.signinsys.entity.Qd;
import com.lnu.signinsys.service.QdService;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// stuName password
		String stuName = request.getParameter("stuName");
		String password = request.getParameter("password");
		System.out.println("学生姓名:" + stuName + ";密码:" + password);
		// service
		QdService qs = new QdService();
		
		Qd q = new Qd(1,stuName, password);
		boolean success = qs.regist(q);

		PrintWriter out = response.getWriter();
		Gson gson = new Gson();

		if (success) {

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("errorcode", 0);
			result.put("status", "ע��ɹ�");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", result);

			out.println(gson.toJson(map));
		} else {

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("errorcode", 200);
			result.put("status", "ע��ʧ��");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", result);

			out.println(gson.toJson(map));
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
