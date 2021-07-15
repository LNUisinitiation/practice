package com.lnu.signinsys.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.lnu.signinsys.entity.Qd;
import com.lnu.signinsys.service.QdService;

/**
 * Servlet implementation class customersearchAllController
 */
@WebServlet("/SelectAllServlet")
public class SelectAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// 接下来的代码写在这里
		// 第一步：实例化一个业务层（Manager）
		System.out.println("sss");
		QdService qdservice = new QdService();
		// 第二步：调用业务层相应的方法
		List<Qd> l = qdservice.getAllList();
		// 第三步：把数据传给终端
		// 第三步1：实例化一个gson
		Gson g = new Gson();
		// 第三步2：通过g把l 转成字符串
		String json = g.toJson(l);
		System.out.println(json);
		//处理乱码
		response.setCharacterEncoding("utf8");
		// 第四步：把json传给终端
		response.getWriter().append(json);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
